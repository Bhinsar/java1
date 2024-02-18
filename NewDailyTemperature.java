import java.util.Stack;

public class NewDailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = new int[] { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 };
        Test7 solution = new Test7();
        int[] output = solution.dailyTemperatures(temperatures);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

class Test7 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> store = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!store.isEmpty() && temperatures[i] >= temperatures[(int) store.peek()]) {
                store.pop();
            }
            if (!store.isEmpty()) {
                res[i] = (int) store.peek() - i;
            }
            store.push(i);
        }
        return res;
    }
}