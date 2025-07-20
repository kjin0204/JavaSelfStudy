package learn01.basic01;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);

        // 값 출력
        System.out.println(map.get("apple")); // 3

        // key 존재 여부
        if (map.containsKey("banana")) {
            System.out.println("바나나 있음");
        }

        // 전체 반복
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
