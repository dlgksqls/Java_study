package lambda.lambda3;

public class GenericMain4 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = new GenericFunction<String, String>() {
            @Override
            public String apply(String  s) {
                return s.toUpperCase();
            }
        };
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer result2 = square.apply(3);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> { // T라는 타입을 넣어서 R을 반환
        R apply(T s);
    }
}
