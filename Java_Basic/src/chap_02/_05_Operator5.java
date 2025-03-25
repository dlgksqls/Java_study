package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y; // 조건이 참이면 x 거짓이면 y
        System.out.println(max);
        System.out.println();

        int min = (x < y) ? x : y;
        System.out.println(min);
        System.out.println();

        boolean b = (x == y) ? true : false;
        System.out.println(b);
        System.out.println();

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
