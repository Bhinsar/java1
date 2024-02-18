public class FirstOccurrence {
    public static void main(String[] args) {
        Solution1 s= new Solution1();
        int k = s.strStr("sadbutsad", "sad");
        System.out.println(k);
    }
}
class Solution1 {
    public int strStr(String haystack, String needle) {
       int m = haystack.length();
       int n = needle.length();
   
       for (int i = 0; i < m - n + 1; i++)
         if (haystack.substring(i,i+ n).equals(needle))
           return i;
   
       return -1;
     }
   }