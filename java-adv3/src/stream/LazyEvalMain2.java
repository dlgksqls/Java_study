package stream;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class LazyEvalMain2 {

    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        ex1(data);
        System.out.println();
        ex2(data);
    }

    private static void ex1(List<Integer> data) {
        System.out.println("=== MyStreamV3 시작 ===");
        MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행 : " + i + "(" + isEven + ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행 : " + i + " -> " + mapped);
                    return mapped;
                });
    }

    private static void ex2(List<Integer> data) {
        System.out.println("=== Stream API 시작 ===");
        data.stream() // 최종연산 ex) toList()이 호출되지 않으면 아무일도 하지 않음 => 지연 연산
                .filter(i -> {
                            boolean isEven = i % 2 == 0;
                            System.out.println("filter() 실행 : " + i + "(" + isEven + ")");
                            return isEven;
                        }
                )
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행 : " + i + " -> " + mapped);
                    return mapped;
                });
    }
}
