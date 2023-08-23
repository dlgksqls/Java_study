package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재미있나?");

        System.out.println("자바가\n너무\n재미있나?");

        System.out.println("해물파전\t9000원\n김치전\t8000원\n부추전\t8000원"); // /t = tab

        System.out.println("C:\\Program Files\\Java"); // C:\Program Files\Java

        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
