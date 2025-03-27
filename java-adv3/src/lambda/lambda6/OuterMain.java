package lambda.lambda6;

public class OuterMain {
    private String message = "외부 클래스";

    public void execute(){
        // 1. 익명 클래스 예시
        Runnable anonymous = new Runnable() {
            private String message = "익명 클래스";

            @Override
            public void run() {
                // 익명 클래스에서의 this 는 자기 익명 클래스의 인스턴스를 가리킴
                System.out.println("[익명 클래스] this: " + this);
                System.out.println("[익명 클래스] this.getClass(): " + this.getClass());
                System.out.println("[익명 클래스] this.getMessage(): " + this.message);
            }
        };

        // 람다 예시
        Runnable lambda = () -> {
            // 람다에서의 this 는 람다가 선언된 틀래스의 인스턴스 (즉, 외부 클래스) 가리킴
            System.out.println("[람다] this: " + this);
            System.out.println("[람다] this.getClass(): " + this.getClass());
            System.out.println("[람다] this.getMessage(): " + this.message);
        };

        anonymous.run(); // 익명 클래스는 익명 클래스의 인스턴스를 가리킴
        System.out.println("==================================");
        lambda.run(); // 람다는 람다가 선언된 클래스의 인스턴스를 가리킴
    }

    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        System.out.println("[외부 클래스]:" + outer);
        System.out.println("==================================");
        outer.execute();
    }
}
