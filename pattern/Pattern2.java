import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            for(int i = num ;i>0;i--){
                for(int j=i;j>0;j--)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}
