package edu.io.pack1.ex;

import java.io.File;
import java.io.IOException;

public class FilePracticeService {
//제공된 FileService.java의 개념(File 객체 생성,
// mkdirs(), createNewFile(), exists(), listFiles() 등)을
// 활용하여 다음 문제들을 해결해 보세요.

    // 문제 1: 상대 경로를 이용한 폴더 및 파일 생성
    /*
    `ava_basic` 프로젝트 폴더(현재 작업 디렉토리)를 기준으로, 상대 경로를 사용하여 다음 작업을 수행하는 Java 메소드를 작성하세요.

    1. 프로젝트 루트 바로 아래에 `my_logs` 라는 이름의 새 폴더(디렉토리)를 생성합니다.
    2. 만약 `my_logs` 폴더가 이미 존재하지 **않는다면** `mkdirs()`를 호출하고, "my_logs 폴더 생성 완료."라고 출력합니다.
    3. 생성된 `my_logs` 폴더 내부에 `access_log.log` 라는 이름의 빈 파일을 생성합니다. (`IOException`에 대한 `try-catch` 처리가 필요합니다.)
    4. 파일 생성이 성공하면 "access_log.log 파일 생성 성공."이라고 출력합니다.
     */
    public void method1(){
        // 1. 경로 정의(상대 경로)
        String path = "my_logs"; // 폴더명칭 맨 앞에 /가 붙지 않으면 현재 작업하고 있는 프로젝트 내 폴더 경로로 인식
        String fileName = "/access_log.log";

        // 2. File 객체 생성
        File logFolder = new File(path);
        File logFileName = new File(path + fileName);

        // 3. 폴더 존재 여부 확인 및 생성
        if(!logFolder.exists()){
            logFolder.mkdirs();
            System.out.println(logFolder.getPath() + " 폴더 생성을 완료했습니다.");
        } else {
            System.out.println("이미 폴더가 존재합니다.");
        }

        // 4. 폴더 존재 확인 후 폴더 내 파일 생성
        try {
            logFileName.createNewFile();
            System.out.println(logFileName.getName() + " 파일 생성을 성공했습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("개발자가 생각치 못한 문제 발생");
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }


    }

    // 문제 2: 기존 디렉토리 목록 조회 및 유형 판별
    public void method2(){

    }

    // 문제 3: 파일 생성 확인 및 삭제 처리
    public void method3(){

    }
}
