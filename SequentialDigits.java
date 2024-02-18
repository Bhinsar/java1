import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SequentialDigits {
    public static void main(String[] args) {
        Test11 test = new Test11();
        List<Integer> out = test.sequentialDigits(1000, 13000);
        System.out.println(out);
    }

}

class Test11 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> out = new ArrayList<Integer>();
        int num = 1;
        int pre = 1;
        int temp = 1;
        while (temp < 10) {
            for (int i = 1; i < 10; i++) {
                num = num * 10;
                pre += 1;
                if (pre == 10) {
                    break;
                }
                num = num + pre;
                // System.out.println(num);
                if (low <= num && num <= high) {
                    out.add(num);
                }
            }
            temp++;
            num = temp;
            pre = temp;
        }
        Collections.sort(out);
        return out;
    }

}