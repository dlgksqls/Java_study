package chap_07.camera;

public final class ActionCam extends Camera { // 이 클래스를 상속 할 수 없음
    //public final String lens = "광각렌즈"; // 값 고정
    public final String lens; // 값 고정

    public ActionCam(){
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeViedo(){ // 메소드 오버라이딩 불가
        System.out.println(this.name+ " : " +this.lens+"로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
