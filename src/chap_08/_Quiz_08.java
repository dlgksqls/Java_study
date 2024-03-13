package chap_08;
import chap_08.Detector.AccidentDetector;
import chap_08.camera.SpeedCam;
import chap_08.repoter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedcam = new SpeedCam();
        speedcam.setDetector(new AccidentDetector());
        speedcam.setReporter(new VideoReporter());
        speedcam.detect();
        speedcam.report();
    }
}
