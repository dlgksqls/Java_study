package chap_08.Detector;

public class AdvancedFireDetector implements detectable{
    @Override
    public void detect() {
        System.out.println("향상된 성능으로 화재를 감지합니다.");
    }
}
