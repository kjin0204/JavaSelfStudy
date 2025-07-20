package learn01.basic01;

public class StringExample {
    public static void main(String[] args) {
        String str = "Java Programming";

        // 문자열 길이
        System.out.println(str.length());

        // 부분 문자열
        System.out.println(str.substring(5, 8)); // Pro

        // 포함 여부
        System.out.println(str.contains("Java")); // true

        // 문자열 비교
        System.out.println(str.equals("Java Programming")); // true
    }
}
