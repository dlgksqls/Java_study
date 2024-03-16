package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        folder = new File(folderName);
        // folder.mkdir(); // 폴더 하나만 만들 때
        folder.mkdirs(); // 하위 폴더 여러개 만들 때
        if(folder.exists()){
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        }
        else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}
