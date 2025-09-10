package edu.io.pack5.ex;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 이미지URL서비스 {

    public void dirSaveImg(String imgUrl, String imgDir,String imgName){
        Path path = Path.of(imgDir,imgName);
        System.out.println("path : " + path);
        System.out.println("path.getParent() : " + path.getParent());
        // 파일이름 중복 처리
        try {
            // path : animal/사자.png
            // path.getParent()    : 하위명칭 이외 폴더들을 모두 가져오는 기능
            // path.getFileName() : 마지막에 존재하는 이름을 가져오는 기능

            // 이름 뒤에 확장자가 오면 확장자를 지운 후 수정 작업이 필요함
            String name = path.getFileName().toString(); // 파일이름 가져오기
            System.out.println("name : " + name);

            int dot = name.lastIndexOf('.'); // . 을기준으로 앞에있는 글자만 가져오겠다.

            String baseName = name.substring(0, dot); // . 이전의 파일 명칭들이 존재
            String extName = name.substring(dot); //.png 확장자 명칭이 들어감

            int count = 1;

            do {
                //               사용자가작성한이름_숫자.png
                String newName = baseName + "_"+count + extName;
                path = Path.of(imgDir,newName);
                count++; // 사자_8 .... 동일한 명칭의 파일이 없을 때 까지 진행

            }while (Files.exists(path));



            System.out.println("baseName : " + baseName);
            System.out.println("extName : " + extName);


            Files.createDirectories(path.getParent());

            URL u = new URL(imgUrl);

            InputStream in = u.openStream(); // 이미지 데이터를 모두 가져올 수있도록 설정
            Files.copy(in, path);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
