package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length() // value
                ));

        System.out.println("map2 = " + map1);

//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato") // 예외 (키 중복)
//                .collect(Collectors.toMap(
//                        name -> name, // key
//                        name -> name.length() // value
//                ));
//
//        System.out.println("map1 = " + map2);

        // 키 중복 대안 (병함)
        Map<String, Integer> map3= Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length(), // value
                        (oldVal, newVal) -> oldVal + newVal // 중복될 경우 기존 값 + 새 값
                ));

        System.out.println("map3 = " + map3);

        // Map의 타입 지정
        Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length(), // value
                        (oldVal, newVal) -> oldVal + newVal, // 중복될 경우 기존 값 + 새 값
                        LinkedHashMap::new
                ));

        System.out.println("map4 = " + map4.getClass());
    }
}
