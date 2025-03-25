package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // String[] coffees = new String[4];
        // String[] coffees = new String[]{"아메리카노","카페모카","라떼","카푸치노"};
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        System.out.println(coffees[0] + " \t하나");
        System.out.println(coffees[1] + " \t하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + " \t하나");
        System.out.println(coffees[3] + " \t하나");
        System.out.println("주세요");
    }
}
