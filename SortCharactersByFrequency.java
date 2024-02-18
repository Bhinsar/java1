import java.util.HashMap;
import java.util.List;
import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "Aabb";
        Test15 test = new Test15();
        String ouString = test.frequencySort(s);
        System.out.println(ouString);
    }
}

class Test15 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            // System.out.println(mapstr);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((ob1, ob2) -> map.get(ob2)-map.get(ob1));
        System.out.println(list);
        StringBuilder res = new StringBuilder();
        for(char c: list){
            for(int i=0;i<map.get(c);i++){
                res.append(c);
            }
        }
               
        return res.toString();
    }

}