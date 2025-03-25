package lambda.ex1;

public class M2After {

    static void print(int weigh, String unit){
        System.out.println("무게 : " + weigh + unit);
    }

    public static void main(String[] args) {
        print(10, "kg");
        print(50, "kg");
        print(200, "g");
        print(40, "g");
    }
}