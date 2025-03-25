package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPowerExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = getPower(5);
        System.out.println(result);

        result = getPowerExp(5,2);
        System.out.println(result);
    }
}
