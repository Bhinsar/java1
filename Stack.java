import java.util.Scanner;
public class Stack {
    public static void main(String[] args) {
        int num=0;
        try (Scanner input = new Scanner(System.in)) {
            while (num==0){
                System.out.println("\nSelect from the following operations");
                System.out.println("1.Insert\t2.Pop\t3.Display\t4.Exit");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element: ");
                        int x =input.nextInt();
                        push(x);
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        System.out.println("Exit");
                        num++;
                        break;
                    default:
                        System.out.print("Invalid choice");
                }
   }
        }
    } 
    static int top = -1;
    static int stack[]=new int[50]; 
    static void push(int x){
        if(top>50){
            System.out.println("Stack overflow");
        }
        else{
            stack[++top]=x;
        }
    }
    static void pop(){
        if(top==-1){
            System.out.print("Stack underflow");
        }
        else{
            top--;
        }
    }
    static void display(){
        if(top>=0){
            for(int i=top;i>=0;i--){
                System.out.print(stack[top]);
            }
        }
        else
            System.out.print("Stack is empty");
    }
}
