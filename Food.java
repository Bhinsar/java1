import java.util.ArrayList;
import java.util.Scanner;
public class Food { 
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> food = new ArrayList<>();
            System.out.print("Enter the number of items: ");
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the " + (i + 1) + " item: ");
                String item = input.next();
                food.add(item);
            }
            System.out.println("Your food list:");
            for (String item : food) {
                System.out.println(item); 
            }
        }
    }
}