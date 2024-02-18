import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int height[] = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };
        Test25 test = new Test25();
        int out = test.furthestBuilding(height, 10, 2);
        System.out.println(out);
    }
}

class Test25 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];
            if (diff > 0) {
                if (pq.size() < ladders) {
                    pq.offer(diff);
                    System.out.println(pq);
                } else {
                    int br = diff;
                    //System.out.println(pq.peek());
                    if (pq.size() > 0 && pq.peek() < diff) {
                        br = pq.remove();
                        System.out.println(br);
                        pq.offer(diff);
                        System.out.println(pq);
                    }
                    if (bricks - br >= 0) {
                        bricks -= br;
                    } else {
                        return i - 1;
                    }
                }
            }
        }

        return heights.length - 1;
    }
}