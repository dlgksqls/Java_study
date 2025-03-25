package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이한빈";
        int hour = 15;

        System.out.println(name + "님, 배송 시작됩니다." + hour + "시 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");
        System.out.println();

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 점수는 " + score + "점 입니다. ");
        System.out.println(score + "점은 " + grade + " 입니다.");
        System.out.println();

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);
        System.out.println();

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);
        System.out.println();

        int i = 1000000000;
        long l = 1000000000000000000L;
        l = 1_000_000_000_000_000_000L;
        System.out.println(i);
        System.out.println(l);

        // int, long, float, double, char, String, boolean
    }
}
