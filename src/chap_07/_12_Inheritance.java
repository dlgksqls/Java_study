package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();

        System.out.println();

        factoryCam.recordViedo();
        factoryCam.detectFire();

        System.out.println();

        speedCam.takePicture();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
