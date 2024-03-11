package chap_08.camera;

import chap_08.Detector.detectable;
import chap_08.repoter.Reportable;

public class FactoryCam extends camera implements detectable, Reportable {
    private detectable detector;
    private Reportable reporter;

    public void setDetector(detectable detector) {
        this.detector = detector;
    }
    public void setReporter(Reportable reporter){
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}