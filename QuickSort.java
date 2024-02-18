import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = input.nextInt();
            int array[] =new int[n];
            for(int i=0;i<n;i++){
                System.out.print("Enter the " + (i + 1) + " item: ");
                array[i] = input.nextInt();
            }
            sort(array,0,n-1);
            for(int i=0;i<n;i++){
                System.out.print(array[i]+" ");
            }
        }
    }
    static void sort(int a[],int l,int h){
        if(l<h){
            int pi = Partion(a,l,h);
            sort(a,l,pi-1);
            sort(a,pi+1,h);
        }   
    }
    static int Partion(int a[], int l, int h) {
        int pivot = a[l];  
        int i = l;         
        int j = h;         

        while (true) {
            while (a[i] <= pivot && i<h ) {
                i++;
            }
            while (a[j] > pivot && j>l) {
                j--;
            }
            if (i >= j) {
                break;  
            }
            swap(a, i, j);
        }
        swap(a, l, j);

        return j;
    }

    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}