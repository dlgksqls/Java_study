package chap_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores); // 스트림 만들어짐

        String[] langs = {"python", "c", "c++", "c#", "java"};
        Stream<String> stream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();

        langList = Arrays.asList("python", "java", "javascript");
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        Stream<String> langListOfStram = Stream.of("python", "java");
        System.out.println(langListOfStram);

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, foreach, anymatch, allmatch, ...
        System.out.println();
        // 90 이상인 숫자만 출력
        Arrays.stream(scores).filter(x->x>=90).forEach(x-> System.out.println(x));

        Arrays.stream(scores).filter(x->x>=90).forEach(System.out::println);
        System.out.println();

        // 90점 이상인 사람의 수
        int count = (int)Arrays.stream(scores).filter(x->x>=90).count();
        System.out.println(count);
        System.out.println();
        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x->x>=90).sum();
        System.out.println(sum);
        System.out.println();

        Arrays.stream(scores).filter(x->x>=90).sorted().forEach(System.out::println);
        System.out.println();
    }
}
