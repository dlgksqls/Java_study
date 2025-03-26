package lambda.ex3;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapExample {

    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, Function<String, String> func) {
        // 코드 작성
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(func.apply(str));
        }
        return result; // 제거하고 적절한 객체를 반환
    }
    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 1. 대문자 변환
        // 코드 작성
        List<String> result1 = map(words, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        System.out.println("대문자 변환 결과: " + result1);
        System.out.println();

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        // 코드 작성
        List<String> result2 = map(words, (s) -> "***" + s + "***");
        System.out.println("특수문자 데코 결과: " + result2);
    }
}
