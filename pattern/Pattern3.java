public class Pattern3 {
    public static void main(String[] args) {
        int num = 5 ;
        for(int i =num; i>0;i--){
            for(int j = i;j>0;j--)
                System.out.print("* ");
            System.out.println();
            for(int j = 0;j<=num-i;j++)
                System.out.print("  ");
        }       
    }
}