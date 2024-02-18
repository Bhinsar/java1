public class PlusOne {
    public static void main(String[] args) {
        int []digits ={9};
        Test10 test= new Test10();
        int []out=test.plusOne(digits);
        for(int i=0;i<out.length;i++){
            System.out.print(out[i]+" ");
        }
    }
}
class Test10{
    public int[] plusOne(int[] digits){
        for(int i =digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}