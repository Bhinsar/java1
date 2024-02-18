import java.util.HashMap;
import java.util.PriorityQueue;

public class LeastNumberUniqueIntegers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 1, 3, 3, 2 };
        int k = 3;
        Test24 test = new Test24();
        int ans = test.findLeastNumOfUniqueInts(arr, k);
        System.out.println(ans);
    }
}

class Test24 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for (int i : arr) {
            mymap.put(i, mymap.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(mymap.values());
        while (k > 0) {
            k -= queue.poll();
        }
        return k < 0 ? queue.size() + 1 : queue.size();

    }
}