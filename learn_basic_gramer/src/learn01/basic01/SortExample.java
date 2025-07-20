package learn01.basic01;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        // 배열 정렬
        int[] arr = {5, 3, 1, 4};
        Arrays.sort(arr); // 오름차순 정렬

        // 리스트 정렬
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        Collections.sort(list); // 오름차순 정렬
    }
}
