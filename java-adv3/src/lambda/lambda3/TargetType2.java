package lambda.lambda3;


import java.util.function.Function;

// 자바가 기본으로 제공하느 Function 사용
public class TargetType2 {

    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");

        Function<Integer, Integer> square = s -> s * s;
        Integer result2 = square.apply(2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
