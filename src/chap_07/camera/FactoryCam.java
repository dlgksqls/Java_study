package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스
//    public String name;

    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장 카메라");// 부모 클래스의 생성자에 접근
    }

    public void recordViedo(){
        // 동영상 녹화
        super.recordViedo();
        detectFire();
    }

//    public void takePicture(){
//        // 사진 촬영
//        System.out.println("사진을 촬영합니다.");
//    }
//    public void recordViedo(){
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }
    // @Override // error
    public void detectFire(){
        // 화재 감지
        System.out.println("화재 감지를 시작합니다.");
    }
    @Override
    public void showMainFeature(){ // 메소드 오버라이딩
        System.out.println(this.name+"의 주요 기능 :  화재 감지 ");
    }
}
