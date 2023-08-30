package chap_09.coffee;

import chap_09.user.User;

public class CoffByUser <T extends User>{
    public T user;

    public CoffByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : "+user.name);
        user.addPoint();
    }
}
