package Chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"},
        };
        System.out.println(seats[1][2]); // B3

        String[][] seats_2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats_2[0][2]);
        // System.out.println(seats_2[0][4]); // index error

    }
}
