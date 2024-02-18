import java.util.HashMap;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        Test13 test = new Test13();
        int n = test.firstUniqChar("aabb");
        System.out.println(n);
    }
}

class Test13 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> string = new HashMap<>();
        for (char i : s.toCharArray()) {
            if (string.containsKey(i)) {
                string.replace(i, string.get(i) + 1);

            } else {
                string.put(i, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (string.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}