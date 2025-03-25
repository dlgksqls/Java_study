package chap_12.clean;

public class CleanThread extends Thread{
    public void run(){
        System.out.println("청소 시작");
        for(int i=1; i<=10;i++){
            System.out.println("(직원)" + i + "번방 청소중 (Thread)");
        }
        System.out.println("직원 청소 끝 (Thread)");
    }
}
