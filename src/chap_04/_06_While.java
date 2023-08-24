package chap_04;

public class _06_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int time = 0;

        while (move < distance){
            time += 1;
            move += 5;
            System.out.println(time + "초 동안 " + move + " m 만큼 이동하였습니다.");
        }
        System.out.println("완주!");
    }
}
