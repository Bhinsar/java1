public class PalindromicStringArray {
    public static void main(String[] args) {
        String [] words ={"xngla","e","itrn","y","s","pfp","rfd"};
        Test21 test = new Test21();
        String str = test.firstPalindromic(words);
        System.out.println("The first palindromic string is " +str);
    }
    
    
}
class Test21{
    public String firstPalindromic(String[] words){
        
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    public boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}