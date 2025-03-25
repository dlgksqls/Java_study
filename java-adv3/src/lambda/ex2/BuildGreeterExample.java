package lambda.ex2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return name -> greeting + ", " + name; // 적절한 람다 반환
    }
    public static void main(String[] args) {
        // 코드 작성
        StringFunction stringFunction1 = buildGreeter("Hello");
        StringFunction stringFunction2 = buildGreeter("Hi");

        System.out.println(stringFunction1.apply("Java"));
        System.out.println(stringFunction2.apply("Lambda"));
    }
}