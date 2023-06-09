package nguyenxuannghia_20001954.lab8.part3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3, 100);
        map.put(5, 102);
        map.put(9, 103);

        System.out.println("Count: " + count(map));
        System.out.println("Contain: " + contains(map, 1));
        System.out.println("Contains key value: " + containsKeyValue(map, 1, 100));

        empty(map);
        System.out.println(getColor(2));
    }

    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.containsValue(value);
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.get(value);
    }
}
