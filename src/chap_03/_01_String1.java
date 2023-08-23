package chap_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자
        System.out.println(s.toLowerCase()); // 소문자

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("java")); // 없으면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보 12
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보 23
        System.out.println(s.startsWith("I like")); // 문장이 이것으로 시작한다면 true
        System.out.println(s.endsWith(".")); // 문장이 이것으로 끝나면 true
    }
}
