package learn01.basic01;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // 배열 선언
        int[] arr = {1, 2, 3, 4};

        // 배열 요소 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println("배열 요소: " + arr[i]);
        }

        // 리스트 선언 (가변 크기 배열)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 요소 추가
        list.add(20);
        list.remove(0); // 요소 제거

        // 리스트 반복
        for (int val : list) {
            System.out.println("리스트 값: " + val);
        }
    }
}
