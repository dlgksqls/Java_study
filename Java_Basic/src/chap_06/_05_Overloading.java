package chap_06;

public class _05_Overloading {
    // 메소드 오버로딩 : 전달값의 갯수, 타입이 다르면 같은 이름의 메소드 정의 가능, 리턴 타입은 같아야함
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }


    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
    }
}
