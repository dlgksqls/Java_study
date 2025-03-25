package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizes = new int[10];
        int num = 250;
        int size_plus = 5;

        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = num + size_plus * i;
            System.out.println("사이즈 " + sizes[i] + "(재고 있음)");
        }
    }
}
