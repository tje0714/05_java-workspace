package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 중복된_파일_폴더명칭_Service {

    public void saveImage1(){

        String originName = "사진.png";

        Path path = Path.of("profiles","member01",originName);
        int dot = originName.lastIndexOf('.'); // . 이 몇번재에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // .확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);
        int count = 1;

        do{
            //               사진        _   숫자     .png
            String NewName = baseName + "_" + count +  extName;
            System.out.println("newName : " + NewName);


            path = Path.of("profiles","member01",NewName); // 기존이름 -> 숫자가 붙은 이름 변경
            count++; // 사진_1 이 존재하면 숫자를 계속 올려서 존재하지 않는 이름이 나올 때 까지 숫자값 상승
        } while (Files.exists(path)); // 파일이름이 존재하면 존재하는 파일이름이 없을 때 까지 반복


        try {
            Files.createDirectories(path.getParent());// profile/member01 까지만 포함
            String imgURL = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTZWlPjghR3F6rno2RtA56T9mRyUL_BWILiAmpxP0-npm6nmw-Gsm9AFDYLAl8paow4CEKMeRHaQn39tB4VniZan8svg2JIpXXOO6L84F4";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
