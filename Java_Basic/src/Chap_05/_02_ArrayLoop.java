package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("\n주세요......");
        System.out.println();

        // enhanced for (for-each) 반복문
        for (String coffee : coffees){ // 배열 순회하는데 인덱스 값을 변수에 저장.. 파이썬으로 따지면 for i in list
            System.out.println(coffee);
        }

    }
}
