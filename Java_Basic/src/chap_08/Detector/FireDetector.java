package chap_08.Detector;

public class FireDetector implements detectable{
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지합니다.");
    }
}
