import java.util.Scanner;
class Pattern1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: "); 
            int num = input.nextInt();
            for(int i=0;i<num;i++){
                for(int j = 0 ; j<=i;j++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}