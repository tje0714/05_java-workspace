package edu.practice.day2;


import java.util.Scanner;

public class Practice {

    /**
     * 문제 1번 : 짝수만 출력하기
     */
    public void method1(){

    }

    /**
     * 문제 4번 : 소수 판별기
     */
    public void method4(){}

    /**
     * 문제 6번 : 숫자 맞히기 게임(1~50)
     */
    public void method6(){}

    /**
     * 문제 7번 : 문자열 분석기
     * - `Scanner sc = new Scanner(System.in)`
     * - `String str` (입력받을 문자열)
     * - `int totalCount = 0, letterCount = 0, digitCount = 0`
     * Character.isLetter(ch), Character.isDigit(ch)
     *
     */
    public void method7(){
        //java.util.Scanner sc = new java.util.Scanner(System.in);
        // 위와 같이 클래스 파일을 가져올 때
        // 파일이 위치한 경로를 매번 앞에 작성하기 번거롭기 때문에
        // import를 사용하여 패키지 명칭 아래 맨 위에 작성해준다.
        /*java.util.*/Scanner sc = /*java.util.*/new Scanner(System.in);

        System.out.print("문자열을 숫자 포함해서 입력해보세요 : ");
        String str = sc.nextLine();
        //int totalCount = str.length(), letterCount = 0, digitCount = 0;
        int totalCount = str.length(); // 사용자가 입력한 문자열의 전체 글자수를 세고 변수이름에 저장
        int letterCount = 0;           // 문자열에서 글자의 개수
        int digitCount = 0;            // 문자열에서 숫자의 개수
        int otherCount = 0;            // 문자도 아니고 숫자고 아닌 것의 개수
        for (int i = 0; i < totalCount; i++) {
            char ch = str.charAt(i); // i 번째 문자열을 ch라는 변수이름에 저장

            /** 문자가 숫자인지 글자인지 boolean(불리언) true false 형태로 결과를 확인
             * Character.isDigit(ch)   = ch가 숫자라면 true
             *      => 숫자가 맞군요!
             * Character.isLetter(ch)  = ch가 문자라면 true
             *      => 문자가 맞군요!
             */
            if (Character.isDigit(ch)) { // ch에 저장된 문자가 숫자라면
                digitCount++;           // 숫자 개수 +1 추가
            } else if (Character.isLetter(ch)) { // ch에 저장된 문자가 숫자가 아닌 글자라면
                letterCount++;                   // 문자 개수 +1 추가
            } else {
                otherCount++; // 글자도 아니고 숫자도 아닌 모든 경우 +1 추가
            }
        }
        System.out.println("\n=== 고객이 작성한 문자열에서 숫자와 문자의 개수 확인하기 ===");
        System.out.println("총 글자수 : " + totalCount);
        System.out.println("숫자 아닌 글자수 : " + letterCount);
        System.out.println("숫자 글자수 : " + digitCount);
        System.out.println("기타 문자(공백, 기호) : " + otherCount);
    }

}
