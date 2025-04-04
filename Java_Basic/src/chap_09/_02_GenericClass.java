package chap_09;

import chap_09.Coffee.*;
import chap_09.User.VipUser;
import chap_09.User.user;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("------------------------");
        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String)c3.name;
        System.out.println("------------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println(c5Name);
        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println(c6Name);
        System.out.println("------------------------");
        CoffeeByUser<user> c7 = new CoffeeByUser<>(new user("강호동"));
        c7.ready();
        CoffeeByUser<user> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();
        // CoffeeByUser<user> c9 = new CoffeeByUser<>(new BlackBox) 오류
        System.out.println("------------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "아메리카노");
    }
    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}