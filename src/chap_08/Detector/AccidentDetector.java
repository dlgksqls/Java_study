package chap_08.Detector;

public class AccidentDetector implements detectable{
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}
