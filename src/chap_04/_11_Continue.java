package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 25;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if (i == noShow){
                System.out.println(i + "번 손님 노쇼로 인해서 다음 손님으로 넘어갑니다.");
                continue;
            }

            sold ++;

            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("장사 끝!");
    }
}
