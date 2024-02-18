import java.util.Arrays;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] m = { 1,2 };
        int[] n = { 3,4 };
        Test9 test = new Test9();
        double p = test.findMedianSortedArrays(m, n);
        System.out.println(p);
    }
}

class Test9 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m =nums1.length;
        int n = nums2.length;
        int[] p = new int[m+n];
        System.arraycopy(nums1,0,p,0,m);
        System.arraycopy(nums2,0,p,m,n);
        Arrays.sort(p);
        int size = p.length;
        if (size % 2 == 0) {
            return (p[size / 2] + p[size / 2 - 1]) / 2.0;
        } else {
            return p[size / 2];
        }
    }
}