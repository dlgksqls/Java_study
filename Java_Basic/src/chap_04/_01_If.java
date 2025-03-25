package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문
        int hour = 10;
        boolean morningCoffee = true;

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가\n");
        }
        System.out.println("커피 주문 완료\n");

        // if (hour < 14 && morningCoffee == false)
        if (hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가\n");
        }
        System.out.println("커피 주문 완료\n");

        hour = 15;
        morningCoffee = true;
        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        if (hour >= 14 || morningCoffee){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료\n");
    }
}
