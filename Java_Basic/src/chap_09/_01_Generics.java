package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 ( 객체이므로 int 말고 Integer, double 말고 Double 사용해야함)
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : type, K : key, E : element
    private static <T> void printAnyArray(T[] array){
        for (T i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] array) {
        for (String i:array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] array) {
        for (double i:array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] array){
        for (int i:array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
