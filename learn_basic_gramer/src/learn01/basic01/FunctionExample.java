package learn01.basic01;

public class FunctionExample {
    // 두 수 더하는 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 메인에서 함수 호출
    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println("합: " + result);
    }
}
