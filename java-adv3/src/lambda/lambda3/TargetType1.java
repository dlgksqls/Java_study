package lambda.lambda3;

public class TargetType1 {
    
    public static void main(String[] args) {
        // 람다 직접 대입
        FunctionA functionA = i -> "value = " + i;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        FunctionA functionB = i -> "value = " + i;
        System.out.println("functionB.apply(10) = " + functionB.apply(10));

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입 (타입이 다르므로 못함)
//        FunctionB targetB = FunctionA; // 컴파일 에러
    }
    
    @FunctionalInterface
    interface FunctionA{
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB{
        String apply(Integer i);
    }
}
