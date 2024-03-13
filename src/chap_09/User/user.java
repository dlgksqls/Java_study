package chap_09.User;

public class user {
    public String name;
    public user(String name){
        this.name = name;
    }
    public void addPoint(){
        System.out.println(this.name + "님, 포인트 적립되었습니다.");
    }
}
