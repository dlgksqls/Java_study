package lambda.lambda5.mystream;

import java.util.List;
import java.util.stream.Stream;

public class MyStreaLoopMain {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> result = MyStreamV3.of(students)
                .filter(std -> std.getScore() >= 80)
                .map(std -> std.getName())
                .toList();

        // 외부 반복
        for (String std : result) {
            System.out.println("std = " + std);
        }
        System.out.println();

        // 내부 반복
        MyStreamV3.of(students)
                .filter(std -> std.getScore() >= 80)
                .map(std -> std.getName())
                .forEach(std -> System.out.println("std = " + std));
    }
}
