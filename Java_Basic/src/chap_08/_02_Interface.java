package chap_08;

import chap_08.Detector.AdvancedFireDetector;
import chap_08.Detector.FireDetector;
import chap_08.Detector.detectable;
import chap_08.camera.FactoryCam;
import chap_08.repoter.NomalReporter;
import chap_08.repoter.Reportable;
import chap_08.repoter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NomalReporter r1 = new NomalReporter();
        r1.report();

        VideoReporter r2 = new VideoReporter();
        r2.report();

        Reportable r3 = new VideoReporter();
        r3.report();

        detectable d1 = new FireDetector();
        d1.detect();
        detectable d2 = new AdvancedFireDetector();
        d2.detect();

        System.out.println("-----------------------");

        FactoryCam fact = new FactoryCam();
        fact.setDetector(d2);
        fact.setReporter(r1);

        fact.detect();
        fact.report();
    }
}
