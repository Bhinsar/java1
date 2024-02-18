public class Reverse {
    public static void main(String[] args) {
        int num = 901000;
        Test5 test = new Test5();
        int num1 = test.reverse(num);
        System.out.println(num1);
    }
}

class Test5 {
    public int reverse(int x) {
        int newx = Math.abs(x);

        int rev = 0;
        while (newx != 0) {
            int pop = newx % 10;

            if (rev > (Integer.MAX_VALUE - pop) / 10)
                return 0;

            rev = rev * 10 + pop;

            newx /= 10;
        }
        return (x < 0) ? (-rev) : rev;
    }
}