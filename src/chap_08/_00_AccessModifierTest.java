package chap_08;

import chap_07.BlackBoxRefubish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefubish b1 = new BlackBoxRefubish();
        b1.modelName = "까망이";
        // b1.resolution = "FHD"; default : 같은 패키지 안에서만...
        // b1.price = 20; private 이므로 해당 클래스에서만 ..
        // b1.color = 20; protected 이므로 해당 패키지에서 .. 다른 패키지 인 경우 자식 클래스에서만...

    }
}
