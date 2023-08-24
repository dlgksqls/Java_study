package Chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 대문자(A)는 65 부터 시작, 소문자(a)는 97 부터 시작, 숫자(0)는 48 부터 시작
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println();
        c = 'B';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println();
        c++;
        System.out.println(c);
        System.out.println((int)c);
        System.out.println();
        c = 'a';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println();
    }
}
