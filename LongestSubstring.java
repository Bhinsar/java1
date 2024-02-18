import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        Test4 solution = new Test4();
        int m=solution.lengthOfLongestSubstring(s);
        System.out.println(m);
    }
}
class Test4 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int j=0;
        int i=0;
        HashSet<Character> store = new HashSet<>();
        while (i <s.length()) {
            if(!store.contains(s.charAt(i))){
                store.add(s.charAt(i));
                max =Math.max(store.size(), max);
                i++;
            }else{
                store.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}