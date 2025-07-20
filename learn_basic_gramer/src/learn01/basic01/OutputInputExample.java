package learn01.basic01;

public class OutputInputExample {
    public static void main(String[] args) {
        // 콘솔에 문자열 출력
        System.out.println("Hello World");

        // 입력받기 위해 Scanner 사용
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // 정수 입력 받기
        int number = sc.nextInt();

        // 문자열 입력 받기 (한 단어)
        String word = sc.next();

        // 문자열 입력 받기 (한 줄)
        sc.nextLine(); // 앞의 nextInt() 때문에 버퍼 비우기용
        String line = sc.nextLine();

        // 입력값 출력
        System.out.println("입력된 숫자: " + number);
        System.out.println("입력된 단어: " + word);
        System.out.println("입력된 문장: " + line);
    }
}
