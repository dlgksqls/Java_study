package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int time = 0;
        int height = 2;

        do {
            move += 5 + height;
            time += 1;
            System.out.println(time + "초 동안 키 "+ height + "m인 사람은 "+ move +"m 이동하였습니다.");
        } while(move + height<distance);
    }
}
