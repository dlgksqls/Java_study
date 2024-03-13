package chap_08.camera;

import chap_08.repoter.Reportable;
import chap_08.Detector.detectable;

public class SpeedCam extends camera implements detectable, Reportable {
    private detectable detector;
    private Reportable reporter;
    public void setDetector(detectable detector){
        this.detector = detector;
    }
    public void setReporter(Reportable reporter){
        this.reporter = reporter;
    }
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호판 인식");
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }
}
