package learn01.basic01;

public class ConditionExample {
    public static void main(String[] args) {
        int score = 85;

        // 조건문
        if (score >= 90) {
            System.out.println("A등급");
        } else if (score >= 80) {
            System.out.println("B등급");
        } else {
            System.out.println("C등급 이하");
        }
    }
}
