import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] nums = new int[] { 6,10,5,12,7,11,6,6,12,12,11,7 };
        int k = 2;
        Test8 test = new Test8();
        int myArray[][] = test.divideArray(nums, k);
            for (int[] row : myArray) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
    }
}

class Test8 {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] res = new int[n/3][3];
        Arrays.sort(nums);
        int a =0;
        for(int i=0;i<n/3;i++){
            for(int j =0;j<3;j++ )
            if(j==0){
                res[i][j]=nums[a++];
            }
            else if(Math.abs(nums[a-j]-nums[a])<=k){
                res[i][j] = nums[a++];
            }
            else{
                return new int[][] {};
            }
        }
        return res;
    }
}