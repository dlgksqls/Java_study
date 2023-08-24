package chap_04;

public class _05_For {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            for (int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("짝 수");
        for (int i = 0; i < 20; i += 2) {
            System.out.print(" "+i);
        }

        System.out.println();
        System.out.println("홀 수");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(" "+i);
        }

        System.out.println();
        System.out.println("감 소");
        for (int i = 20; i >= 0 ; i--) {
            System.out.print(" "+i);
        }

        System.out.println();
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum += i;
        }
        System.out.println("1~20까지의 합 = "+ sum);


    }
}
