package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 ( 학생은 사람이다. Student is a person )
        // class Teacher extends Person : 선생님 ( 선생님은 사람이다. Teacher is a person )

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        System.out.println("-----------------------------------------------");

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("-----------------------------------------------");

        // factoryCam.detectFire(); // 부모 클래스로 정의했기 때문에 자식 클래스의 메소드 사용 불가
        if (camera instanceof Camera){
            System.out.println("카메라 입니다.");
        }
        if (factoryCam instanceof Camera){
            ((FactoryCam)factoryCam).detectFire();
        }
        if (speedCam instanceof Camera) {
            ((SpeedCam)speedCam).checkSpeed();
        }
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }

}

