package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int pricePerHour = 4000;
        int hour = 10;
        int sum = 0;
        boolean disalbe = true;
        boolean light = true;

        for (int i = 0; i < hour ; i++) {
            sum += pricePerHour;
            if (sum > 30000) {
                sum = 30000;
                break;
            }
        }

        if (disalbe || light){
            sum /= 2;
        }
        System.out.println("주차 요금 : "+ sum);
    }
}
