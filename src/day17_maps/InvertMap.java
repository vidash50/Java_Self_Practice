package day17_maps;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Map<Integer, String> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(invertedMap);

    }
}
/*
2. Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */