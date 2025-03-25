package Chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1","A2","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"},
        };

        for (int i = 0; i < seats.length; i++) { // 세로
            for (int j = 0; j < seats[i].length; j++) { // 가로
                System.out.print(seats[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        // 세로 크기 10 x 가로 크기 15
        String[][] seats_2 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats_2.length; i++) {
            for (int j = 0; j < seats_2[i].length; j++) {
                seats_2[i][j] = String.valueOf(ch) + (j + 1);
                System.out.print(seats_2[i][j] + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
