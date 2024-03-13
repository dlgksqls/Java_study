package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println();

        // 추가
        list.addFirst("서장훈"); // 맨 앞에 데이터 추가
        for(String i : list){
            System.out.println(i);
        }
        System.out.println("");
        list.addLast("김희철");
        for(String i : list){
            System.out.println(i);
        }
        System.out.println();

        list.add(1, "김영철");
        for(String i : list){
            System.out.println(i);
        }
        System.out.println();

        // 삭제
        System.out.println(list.size());
        list.remove(list.size() - 1);
        list.removeFirst(); // 처음 데이터 삭제
        list.removeLast(); // 마지막 데이터 삭제

        System.out.println(list.size());

        for(String i : list){
            System.out.println(i);
        }
        System.out.println();

        // 변경 (수강권 양도)
        list.set(0, "이수근"); // 데이터 변경

        for(String i : list){
            System.out.println(i);
        }
        System.out.println();

        // 확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")){
            System.out.println("수강 신청 성공");
        }
        else{
            System.out.println("수강 신청 실패");
        }

        // 전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println(list.size());
        }

        // 새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list); // 정렬
        for (String i:list)
            System.out.print(i + " ");
    }
}
