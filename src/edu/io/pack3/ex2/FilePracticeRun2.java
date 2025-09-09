package edu.io.pack3.ex2;


import java.util.Scanner;

public class FilePracticeRun2 {
    public static void main(String[] args) {
        FilePracticeService2 fps = new FilePracticeService2();

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까? (yes/no): ");
        //              글자입력받고  공백없음 모두소문자처리
        String choice = sc.nextLine().trim().toLowerCase();
        String dirName="";
        if(choice.equals("yes") || choice.equals("y")){
            System.out.print("폴더명을 입력하세요 : ");
            dirName = sc.nextLine().trim();
        } else {
            dirName = "";
            System.out.println("기본 프로젝트 최상위 폴더로 설정됩니다.");
        }

        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        fps.method1(dirName,fileName);
    }
}
