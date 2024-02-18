public class PalindromicSubstrings {
    public static void main(String[] args) {
        Test18 test = new Test18();
        int n = test.countSubstrings("aaa");
        System.out.println(n);
    }
}
class Test18 {
    public int countSubstrings(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int l=i ,r=i;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
                res++;
            }
            l=i;
            r=i+1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
                res++;
            }
        }

        return res;
        
    }
}