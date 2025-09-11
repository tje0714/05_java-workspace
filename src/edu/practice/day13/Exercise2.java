package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.*;

public class Exercise2 {
    public void solution1() {
        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("info.txt");
        String content = "이름: 홍길동\n나이: 25\n전공: 컴퓨터공학\n학년: 3학년\n";
        try {
            Files.createDirectories(studentDir);
            System.out.println(filePath.getParent() +" 생성되었습니다.");
            Files.writeString(filePath, content); // 파일안에 , 내용작성
            System.out.println(filePath.getFileName() + "에 내용이 작성되었습니다.");
            Files.readString(filePath);           // 어떤  파일을 읽을 것인가
            // readString 은 읽는 용도가 맞으나, 컴퓨터가 읽은 것이지
            // 컴퓨터가 읽은 내용을 클라이언트 눈에 보여줄 의무는 없음
            System.out.println(Files.readString(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void solution2() {
        Path textDir = Path.of("downloads", "text","downloaded_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";
        try {
            Files.createDirectories(textDir.getParent());
            URL url = new URL(textUrl);
           // InputStream inputStream = url.openStream();
            if(!Files.exists(textDir)) {
                Files.copy(url.openStream(),textDir);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void solution3() {
        Path backupDir = Path.of("backup");   // 1번 경로 설정
        String baseName = "document";
        String extension = ".txt";
        String content = "이것은 백업 문서입니다.";
        int counter = 1;
        Path textDir = backupDir.resolve(baseName + extension);
        // 기존 경로 + 파일명칭 이어 작성할 때 주로 사용
        // 경로를 설정할 때 처음부터 Path.of 로 완벽한 경로를 설정한 후 경로 내에 파일 명칭이 들어갈 수 있도록
        // 설정
        try {
            Files.createDirectories(backupDir);                 // 2번 폴더 존재유무 확인 후 생성

            while ( Files.exists(textDir) ) {
                String newName = baseName + counter + extension;
                textDir = backupDir.resolve(newName);

                // 추후 문제가 생겼을 경우 실행할 작업은 맨 아래에 작성
                counter++;

            }
            System.out.println(textDir);
            Files.writeString(textDir, content);
            System.out.println(textDir.getFileName() + "파일이 완성되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    /*
    1단계: 임시 파일 생성 완료 - temp/data.txt
    2단계: 폴더 생성 완료 - archive, backup
    3단계: 파일 이동 완료 - temp/data.txt -> archive/data.txt
    4단계: 백업 복사 완료 - backup/data_backup.txt
    모든 작업이 완료되었습니다.
     */
    public void solution4() {
        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");
       // Files.move(), Files.copy()
       // StandardCopyOption.REPLACE_EXISTING


        try {
            // 1단계 : 임시 파일 생성
            Files.createDirectories(sourceFile.getParent());
            Files.writeString(sourceFile,"임시 데이터");
            System.out.println("1단계 : 임시 파일 생성 완료 : " + sourceFile);

            // 2단계 : 폴더 생성하기
            Files.createDirectories(archiveDir);
            Files.createDirectories(backupDir);
            System.out.println("2단계 : 폴더 생성 완료 : " + archiveDir.getFileName()  + ", " + backupDir.getFileName());

            // 3단계 : 파일 이동
            Files.move(sourceFile,targetFile,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계 파일 이동 완료 : " + sourceFile + " -> " + targetFile);

            // 4단계 : 백업 복사
            Files.copy(targetFile,backupFile,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계 : 백업 복사 완료 : " + backupFile);
            System.out.println("모든 작업이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void solution5() {

    }
}
