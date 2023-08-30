package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("------------------------");

        int c3Name = (int)c3.name; // obj 일때는 형 변환해서 넣어줘야함
        System.out.println("주문 고객 번호 : "+c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : "+c4Name);

        // c4Name = (String) c3Name;

        System.out.println("------------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name; // 제네릭은 그럴필요 x

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;

        System.out.println("------------------------");

        CoffByUser<User> c7 = new CoffByUser<>(new User("강호동"));
        c7.ready();
        CoffByUser<User> c8 = new CoffByUser<>(new VipUser("서장훈"));
        c8.ready();

        System.out.println("------------------------");

        orderCoffee("김영철","아메리카노");
        orderCoffee(36,"카페라떼");
    }

    public static<T, V> void orderCoffee(T name, V coffee){
        System.out.println("커피 준비 완료 : "+name+" "+coffee);
    }
}
