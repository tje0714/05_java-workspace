package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 프로필사진service {

 // 1으로 끝나는 명칭들만 이용해서 member03 폴더 member04 폴더에 각각 프로필사진2.txt 저장
    public void createProfileFolder(String memberId, String profilePicture){

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", memberId);
       // Path memberFolder2 = Path.of("profiles", "member02");
        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
            // Files.createDirectories(memberFolder2);
            // 3. 폴더 내에 프로필 사진 저장하기
            Path picture1 = Path.of("profiles", memberId,profilePicture);
         //   Path picture2 = Path.of("profiles", "member02","프로필사진02.txt");
            Files.writeString(picture1,"프로필 사진 이미지 입니다.");
          //  Files.writeString(picture2,"프로필 사진 이미지 입니다.");
            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생 했을 때 문제 해결");
            // 1. 메인 서버가 끊기면 2번 째 후보 서버 로 저장 시작
            // 2. 이미지가 5MB 이상 초과되면 저장 못하게하고, 5MB 초과할 수 없음을 사용자에게 알리기
        }

    }

    // 이미지 주소로 이미지 저장하기

    public void saveImg(String imgUrl){
      //  String imgUrl = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";


        Path memberFolder1 = Path.of("profiles", "member06");

        try {


            Files.createDirectories(memberFolder1);
            Path picture1 = Path.of("profiles", "member06","사진1.png");

            // 4. 이미지 주소에서 이미지 다운로드 처리 후
            System.out.println("이미지 다운로드 중 ...");
            // URL = 클라이언트가 작성한 이미지 주소를 java에서 (읽거나 쓰거나) 사용할 수 있도록 설정하는 문서
            URL url = new URL(imgUrl);

            // InputStream = 인터넷에서 데이터가 흘러들어오는 통로를 만듬
                                    // 이미지주소에서   데이터가 들어올 수 있도록 통로를 열어두는 기능
            InputStream inputStream = url.openStream();

            // 5. 파일로 저장하기
            // 인터넷에 존재하는 이미지를 내 컴퓨터에 복제                     선택사항      기존에 이미지이름이 존재하면 덮어쓰기 형태로 이미지이름에 현재 저장하는 이미지 데이터를 설정
            Files.copy(inputStream,picture1, StandardCopyOption.REPLACE_EXISTING);
            // 데이터를 모두 가져오고, 가져온 데이터를 복사해서 내 컴퓨터에 저장이 완료되면,
            // 데이터가 들어올 수 있는 통로 닫아두기 설정을 해주어야 저장이 완료됨
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생 했을 때 문제 해결");
        }

    }
    // profiles     member07 내부에 복사한 이미지 저장
    public void saveImg2(String  imgUrl2){
    // 회원 폴더 경로 생성
        Path mf = Path.of("profiles", "member07");


        try {
            // 폴더 생성하기
            Files.createDirectories(mf);

            // 프로필 파일 경로
            Path pf = Path.of("profiles", "member07", "이미지이름.png");

            // 인터넷 주소에서 이미지를 다운로드 할 수 있도록
            // String 으로 가져온 문자열 주소가 인터넷 상 에 존재하는 주소임을 설정하는 URL 클래스 사용
            URL url = new URL(imgUrl2);// String 문자열에 담긴 글자가 url 주소임을 설정
            //     데이터 가져오기   = 인터넷주소에서. 데이터를 가져올 수 있도록 열어놓기
            InputStream inputStream = url.openStream();

            // 로 복사해서 저장하기        인터넷상에서 가져온 데이터이미지를, 이미지이름.png
            Files.copy(inputStream,pf);
            // 저장 완료되었으면 닫아주기
            inputStream.close();
            System.out.println("이미지 저장 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void saveImg3(){
        Path mf = Path.of("profiles", "member07");


        try {

            String imgUrl2 = "https://img.freepik.com/free-vector/holiday-flat_138676-9999.jpg";

            Files.createDirectories(mf);
            Path pf = Path.of("profiles", "member07", "이미지이름.png");

            URL url = new URL(imgUrl2);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream,pf);

            inputStream.close();
            System.out.println("이미지 저장 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
