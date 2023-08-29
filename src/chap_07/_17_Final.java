package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final

        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ....

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; //  못 바꿈
        actionCam.recordViedo();
        actionCam.makeViedo();
        System.out.println();

        SlowActionCam slowActionCam = new SlowActionCam();
        System.out.println(slowActionCam.name);
        slowActionCam.makeVideo();
        //slowActionCam.recordViedo();
        //slowActionCam.makeViedo();
    }
}
