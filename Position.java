public class Position {
    public static void main(String[] args) {
        int[] nims = new int[]{1, 3, 5, 6};
        int target = 5;
        Solution solution = new Solution();
        int Insert = solution.searchInsert(nims, target);
        System.out.println(Insert);
    }
}

class Solution {
    public int searchInsert(int[] nims, int target) {
        for (int i = 0; i < nims.length; i++) {
            if (nims[i] == target) {
                return i;
            } else if (nims[i] < target && (i == nims.length - 2 || nims[i + 1] > target)) {
                return i + 1;
            }
        }
        return 0;
    }
}
