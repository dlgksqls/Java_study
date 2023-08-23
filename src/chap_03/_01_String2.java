package chap_03;

public class _01_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // and -> ,
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작
        System.out.println(s.substring(s.indexOf("Java"))); // Java의 인덱스 부터 시작
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java ~ C 까지 출력
        System.out.println();

        // 공백 제거
        s = "       I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거
        System.out.println();

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 +s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }
}
