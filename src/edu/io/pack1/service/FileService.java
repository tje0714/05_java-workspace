package edu.io.pack1.service;

import java.io.File;
import java.io.IOException;

public class FileService {
    /* File 클래스

    - java.io 패키지

    - 파일 / 디렉토리(폴더) 관리하는 클래스
            (파일/디렉토리 존재 유무 관계 없음)

    - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공

    - File 클래스 메서드(기능들)

    boolean  mkdir()         : 디렉토리 생성( 한 개의 폴더만 생성 make directory(=folder) )
    boolean  mkdirs()        : 경로상에 존재하는 모든 디렉토리 생성(폴더 여러개 한 번에 생성 make directory(=folder) )
    boolean createNewFile()  : 파일 생성
    boolean delete()         : 파일 / 디렉토리 삭제
    String  getName()        : 파일 이름 반환
    String  parent()         : 파일 저장된 디렉토리 반환
    String  getPath()        : 전체 경로 반환
    boolean isFile()         : 현재 File 객체가 관리하는게 파일이면 true
    boolean isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
    boolean exists()         : 파일/디렉토리가 존재하면 true, 아니면 false
    long    length()         : 파일 크기 반환
    long    lastModified     : 파일 마지막 수정일(1970.01.01 9:00) 부터 현재까지 지난 시간을 ms 단위로 반환)
    String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
    File[] listFiles()       : 디렉토리 내 파일 목록을   File[] 배열로 반환
     */

    /**
     * File 클래스로 객체 생성
     * + 폴더가 존재하지 않으면 폴더를 생성하자
     */
    public void method1(){
        // 제일 앞 "/" : 최상위 폴더 ( == root , 절대 경로의 기준점)

        // C 드라이브 폴더 다음에 io_test 폴더 와   gildong 길동 폴더가 존재하는지 확인하고
        // 존재하지 않으면 생성, 존재하면 생성 하지 않음

        File 폴더들 = new File("/io_test/gildong");
        // -> 처음에는 존재하는지 존재하지 않는지 모르겠지만 개발자가 확인하고자 하는
        // 폴더의 명칭(들)을 가지고 있는 File 객체를 폴더들 이라는 이름으로 생성

        System.out.println("폴더들의 존재여부 확인 : " + 폴더들.exists());

       // 폴더들.exists(); -> true false

        // 폴더 모두 생성
        폴더들.mkdirs(); //폴더가 하나가 아닌 io_test 폴더 안에 gildong 이라는 폴더를 생성할 예정이기 때문

        System.out.println("마지막 폴더의 명칭 : " + 폴더들.getName());
        System.out.println("마지막 폴더까지 오기 전 모든 경로들 : " + 폴더들.getPath());
    }


    /**
     * File 객체를 이용해서
     * 지정된 위치에 파일 생성하기
     */
    public void method2(){

        File 파일하나 = new File("/io_test/gildong/파일생성확인.txt");

        // 폴더 생성 mkdir() mkdirs()
        // 폴더와 별개로 [파일] 을 마지막에 생성할 때
        // 파일 생성할 때
        // 특정 위치에 파일 생성할 때 사용하는 기능
        // createNewFile()

        try { // 컴퓨터에서 코드를 실행할 때 발생할 수 있는 문제 코드를 실행 시도할 것이다.
            파일하나.createNewFile();
        } catch (IOException e) { //실행시도할 때 문제가 생성되면
            // 예외상황으로 인하여 자바 전체 프로그램을 중지하는 것이 아니라
            // 특정 기능에 대한 문제를 개발자가 회사나 프로그램에 알맞는 방향으로
            // 기능이 진행될 수 있도록 설정
            System.out.println("파일을 생성하는도중 문제가 발생했습니다.");

        } catch (Exception e){
            System.out.println("개발자가 발견하지 못한 문제들 확인 추후 문제들에 대하여");
            System.out.println("Exception 으로 도달하기 전에 catch 문으로 해당하는 문제에 대해 ");
            System.out.println("개발자가 처리할 수 있도록 문제를 확인하는 공간 ");
            e.printStackTrace(); //예외 정보 + 예외가 발생한 위치까지의 기능들 추적해서 출력
            System.out.println(e.getMessage()); // e.printStackTrace(); 와 비슷한 형태
            // e.printStackTrace(); e.getMessage() 둘 중하나 택해서 사용하면 됨!
        }

    }



    // method3 c 드라이브 아래에 폴더들 생성
    // io_test/practice/폴더및파일생성.txt
    // 까지 생성하고 생성된 결과 출력
    // 성공적으로 생성완료 되었다면 ㅇㅇ 파일이 생성되었습니다.
    // 생성하지 못했다면 ㅇㅇ 파일을 생성하지 못했습니다.
    // if 문 활용해서 출력
}

