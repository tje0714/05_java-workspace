package edu.io;

import java.nio.file.Path;

public class 설정 {
    public static final String DIR_PROFILE_WINDOW_ONE = "C:";
    public static final String DIR_PROFILE_WINDOW_TWO = "문서";
    public static final String DIR_PROFILE_WINDOW_THREE = "KakaoTalk";


    public void 프로필사진저장(){
        String fileName = "KakaoTalk_" + System.currentTimeMillis() + ".jpg";
        Path dirPath = Path.of(DIR_PROFILE_WINDOW_ONE,DIR_PROFILE_WINDOW_TWO,DIR_PROFILE_WINDOW_THREE,fileName);
    }
}
