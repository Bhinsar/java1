import java.util.ArrayList;
import java.util.List;
public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {3,4,8};
        Test17 test = new Test17();
        List<Integer> out = test.largestDivisibleSubset(nums);
        System.out.println(out);
    }
}

class Test17 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(list.isEmpty()){
                    list.add(nums[i]);
                }
                if (nums[i] % nums[j] == 0 || nums[j]%nums[i]==0  ) {
                   
                    if (!peek(nums[j], list)) {
                        list.add(nums[j]);
                        System.out.println(list);
                    }
                } else if(list.contains(nums[j])) {
                    int k=list.indexOf(nums[j]);
                    System.out.println(k);
                    list.remove(k);
                    System.out.println(list);
                }else{
                    break;
                }
            }
        }
        return list;
    }

    public static boolean peek(int x, List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            // System.out.println(list.get(i));
            if (list.get(i) == x) {
                return true;
            }
        }
        return false;
    }
}