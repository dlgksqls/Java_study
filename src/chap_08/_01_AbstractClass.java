package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;
import chap_08.camera.camera;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstarct 완성되지 않은 클래스
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)
        FactoryCam c1 = new FactoryCam();
        SpeedCam c2 = new SpeedCam();
        camera c3 = new FactoryCam();

        c1.showMainFeature();
        c2.showMainFeature();
        c3.showMainFeature();
    }
}
