package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 : 중복 허용 x, 순서 보장 x
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("삼겹살");
        set.add("야채");
        set.add("채소");
        set.add("밥");
        set.add("라면");
        set.add("삼겹살");
        set.add("쌈장");

        System.out.println(set.size());

        for(String i : set)
            System.out.println(i);
        System.out.println();

        // 확인
        if(set.contains("삼겹살"))
            System.out.println("삼겹살 사러 출발");
        System.out.println();

        // 삭제
        set.remove("삼겹살");
        if(set.contains("삼겹살"))
            System.out.println("삼겹살 사러 출발");
        else
            System.out.println("삼겹살을 구매하지 않습니다.");
        System.out.println();

        // 전체 삭제
        set.clear();
        if(set.isEmpty()) {
            System.out.println(set.size());
        }
        // 순서 보장
        HashSet<Integer> intset = new LinkedHashSet<>();
        intset.add(3);
        intset.add(1);
        intset.add(5);

        for (int i : intset)
            System.out.println(i);
    }
}
