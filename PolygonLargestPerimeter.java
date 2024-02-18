import java.util.Arrays;

public class PolygonLargestPerimeter {
    public static void main(String[] args) {
        int[] nums = { 5,5,5 };
        Test23 test = new Test23();
        long per = test.largestPerimeter(nums);
        System.out.println(per);
    }
}

class Test23 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
        }
        System.out.println(sum);


        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<sum){
                sum+=nums[i];
                return sum;
            }else{
                sum-=nums[i-1];
            }
        }
        return -1;
    }
}