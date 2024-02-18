public class LongestPalindromic {
    public static void main(String[] args) {
        String s = "babad";
        Test5 solution = new Test5();
        String m = solution.longestPalindrome(s);
        System.out.println(m);
    }
}

class Test5 {
    public String longestPalindrome(String s) {
        String res = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > n) {
                    res = s.substring(l, r + 1);
                    //System.out.println(res);
                    n = r - l + 1;
                    l--;
                    r++;
                }
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > n) {
                    res = s.substring(l, r + 1);
                    //System.out.println(res);
                    n = r - l + 1;
                    l--;
                    r++;
                }
            }
        }

        return res;
    }
}