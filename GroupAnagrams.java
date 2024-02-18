import java.util.List;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] sars = { "eat", "tea", "tan", "ate", "nat", "bat" };
        Test14 test = new Test14();
        List<List<String>> list = test.groupAnagrams(sars);
        System.out.println(list);
    }
}

class Test14 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char str[] = strs[i].toCharArray();
            Arrays.sort(str);
            String s = String.valueOf(str);
            System.out.println(s);
            if (map.get(s) != null) {
                List<String> a = map.get(s);
                a.add(strs[i]);
                map.put(s, a);
            } else {
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(s, a);
            }
        }
        for (Map.Entry<String, List<String>> en : map.entrySet()) {
            res.add(en.getValue());
        }
        return res;
    }
}