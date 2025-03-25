package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };

        samInterface.run();

        // 컴파일 오류
//        NotSamInterface notSamInterface = () -> { // 메서드가 두개인 것에는 사용 못함
//            System.out.println("not sam");
//        };
    }
}
