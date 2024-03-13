package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------------------------");

        // 삭제 (박명수)
        System.out.println(list.size());
        list.remove("박명수");
        System.out.println(list.size());
        System.out.println(list.get(3));

        System.out.println("-------------------------");

        System.out.println(list.size()); // 4
        list.remove(list.size() - 1);
        System.out.println(list.size()); // 3
        System.out.println("-------------------------");

        for (String i : list){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        // 변경 (수강권 양도)
        list.set(0, "이수근");
        for (String i : list){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        // 확인
        System.out.println(list.indexOf("김종국")); // 2
        // 선착순 5명 내에 포함되었는가?
        if (list.contains("김종국")) // 김종국이 포함돼있는지?
            System.out.println("수강 신청 성공");
        else
            System.out.println("수강 신청 실패");
        System.out.println("-------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println(list.size());
            System.out.println("리스트가 비었다");
        }
        System.out.println("-------------------------");
        // 다음 학기에 새로 공부 시작
        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);
        for (String s:list)
            System.out.println(s);
    }
}