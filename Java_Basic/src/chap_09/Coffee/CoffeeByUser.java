package chap_09.Coffee;

import chap_09.User.user;

public class CoffeeByUser <T extends user>{ // user 객체만 받는다는 뜻
    public T user;
    public CoffeeByUser(T user){
        this.user = user;
    }
    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
