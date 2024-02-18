import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 1000000000, 1000000000, -1000000000, -1000000000, -1000000000 };
        Test20 test = new Test20();
        int result = test.majorityElement(nums);
        System.out.println("Majority element is " + result);
    }
}

class Test20 {
    public int majorityElement(int[] nums) {
        int n = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < Math.max(max, entry.getValue())) {
                max = Math.max(max, entry.getValue());
                n = entry.getKey();
            }
        }
        return n;
    }
}