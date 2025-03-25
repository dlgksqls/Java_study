package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, double, long, boolean, ..... 메소드 가지지 않음
        int [] i = new int[3];
        System.out.println(i[0]); // 기본 값 0

        double[] d = new double[3];
        System.out.println(d[0]); // 기본 값 0.0

        // 참조 자료형 (Nom-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ..... 메소드 가질 수도..
        String [] s = new String[3];
        System.out.println(s[0]); // null

        Camera [] c = new Camera[3];
        System.out.println(c[0] == null); // true, c[0] == null

        //////////////////////////////////////////////////////////////////////////////////
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라 1";
        c2.name = "카메라 2";
        c2 = c1; // c2가 c1을 가리키게 됨
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("--------------------------------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        // c2 = null; 잡고 있던 손을 놓음

    }
    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}
