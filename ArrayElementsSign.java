public class ArrayElementsSign {
    public static void main(String[] args) {
        int[] array = { -1, -2, -3, 3, 4, 5 };
        Test22 test = new Test22();
        int[] output = test.rearrangeArray(array);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}

class Test22 {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int pos = 0, neg = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                res[pos] = nums[i];
                pos += 2;
            } else {
                res[neg] = nums[i];
                neg += 2;
            }
        }

        return res;

    }
}