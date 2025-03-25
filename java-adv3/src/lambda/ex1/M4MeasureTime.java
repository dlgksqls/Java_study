package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {

    static void measure(Procedure p){
        long startNs = System.nanoTime();
        p.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {

        Procedure sum = () -> {
                int result = 0;
                int n = 100;
                for(int i=0; i<=n; i++){
                    result += i;
                }
                System.out.println("[1부터 100까지 합] 결과: " + result);
            };

        Procedure sort = () -> {
                int[] arr = { 4, 3, 2, 1 };
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            };

        measure(sum);
        System.out.println();
        measure(sort);
    }
}
