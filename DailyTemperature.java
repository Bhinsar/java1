public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = new int[] { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 };
        Test6 solution = new Test6();
        int[] output = solution.dailyTemperatures(temperatures);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

class Test6 {
    public int[] dailyTemperatures(int[] temperatures) {
        int count = 0;
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    count++;
                    res[i] = count;
                    break;
                } else {
                    count++;
                }
            }
            count = 0;
        }

        return res;
    }
}