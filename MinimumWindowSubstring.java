import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Test12 test = new Test12();
        String out = test.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(out);
    }
}

class Test12 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char i : t.toCharArray()) {
            if (mapT.containsKey(i)) {
                mapT.replace(i, mapT.get(i) + 1);
                
            } else {
                mapT.put(i, 1);
            }
        }
        int count = mapT.size();
        for(char i:s.toCharArray()){
            if(mapT.containsKey(i)){
                mapT.put(i, mapT.get(i)-1);
                if(mapT.get(i)>=0)
                    count--;
            }if(count==0){
                break;
            }
        }
        
        return t;
    }
}