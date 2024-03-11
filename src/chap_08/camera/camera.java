package chap_08.camera;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class camera {
    public void takePicture(){
        System.out.println("사진 촬영");
    }
    public void recordVideio(){
        System.out.println("동영상 녹화");
    }
    public abstract void showMainFeature(); // 구현해야 하는 메소드
}
