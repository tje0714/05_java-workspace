package edu.practice.day2;


import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    /**
     * 문제 1번 : 짝수만 출력하기
     */
    public void method1(){
        Scanner sc=new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int input1 =  sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int input2 =  sc.nextInt();
        int min = Math.min(input1,input2);
        int max = Math.max(input1,input2);
        // Math.min(input1, input2), Math.max(input1, input2)
        for(int i = min; i<=max; i++){
            if(i%2==0){
                System.out.print(i + "");
            }
        }
        System.out.println(); //int Enter 처리
    }

    /**
     * 문제 2번 : 별표 삼각형 만들기
     */
    public void method2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("높이를 입력하세요 : ");
        int height =  sc.nextInt();
        System.out.println(); // int 남은 버퍼 처리
        // 높이만큼 별의 개수 출력
        for(int i = 1 ; i<=height ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 문제 3번 : 팩토리얼 계산기
     */
    public void method3(){
        Scanner sc =new Scanner(System.in);
        System.out.print("팩토리얼을 구할 숫 자를 입력하세요 : ");
        int number = sc.nextInt();
        int factorial = 1;
        // 계산과정을 넣기 위한 문자열 변수
        String process ="";
        // number 부터 1까지 내려가면서 계산
        for(int i=number; i>=1;i--){
            factorial *= i;
            process += i; //문자열에 현재 숫자(i)를 추가
            if( i > 1) {
                process += " x" ;
            }
        }
        // for 문 탈출 후
        System.out.printf("%d! = %s = %d \n",number, process, factorial);

    }
    /**
     * 문제 4번 : 소수 판별기
     */
    public void method4(){
        Scanner sc =new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        boolean isPrime = true;
        if(number < 2){
            isPrime = false;
        } else {
            for(int i = 2; i<=number; i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
        }


        if(isPrime){
            System.out.println(number + "는  소수입니다.");
        } else {
            System.out.println(number + "는 소수가 아닙니다.");
        }
    }
    /**
     * 문제 5번 : 구구단 선택기
     * === 구구단 프로그램 ===
     * 1. 특정 단 출력
     * 2. 전체 구구단 출력
     * 0. 종료
     * 선택: 1
     * """ """" <pre></pre> 같은 출력 구문
     */
    public void method5(){
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("""
=== 구구단 프로그램 ===
1. 특정 단 출력
2. 전체 구구단 출력
0. 종료
                    """);
            System.out.print("선택 :");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("몇 단을 출력하시겠습니까 : ");
                    int dan = sc.nextInt();
                    System.out.println("[ " + dan + " ]단");
                    for(int i = 1; i<=9; i++){
                        System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
                    }
                case 2:
                    System.out.println("=== 전체 구구단 ===");
                    for(int j = 2; j<=9; j++){

                        System.out.println("[ " + j + " ]단");
                        for(int i = 1; i<=9; i++){
                            System.out.printf("%d X %d = %2d\n", j, i, j * i);
                        }
                        System.out.println( );
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return; // while 구문 탈출해서 기능 중지
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }


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

    /**
     * 문제 8번 : 성적 관리 프로그램
     */
    public void method8(){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int total = 0;

        System.out.print("5명의 성적을 입력하세요 : ");
        // 성적 입력받기
        for(int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생");
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        double average = (double)total / scores.length;

        int max = scores[0];
        int min = scores[0];

        for(int i = 1; i < scores.length; i++) {
            max = Math.max(scores[i], max);
            min = Math.min(scores[i], min);
        }
    }
    /**
     * 문제 9번 : 배열 뒤집기
     */
    public void method9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 (1~10) : ");
        int size = sc.nextInt();

        // 배열 크기 제한
        if(size <1 || size > 10){
            System.out.println("1~10 사이의 숫자를 입력하세요 : ");
            return;
        }

        int[] original =  new int[size];
        int[] reversed = new int[size];

        // 원본 배열 입력받기
        for(int i = 0; i< original.length; i++){
            System.out.print((i + 1) + "번째 숫자 입력 : ");
            original[i] = sc.nextInt();
        }

        // 배열 뒤집기
        for(int i = 0; i<size; i++) {
            reversed[i] = original[size - 1 - i];
        }

        System.out.println("\n원본 배열 : " + Arrays.toString(original));
        System.out.println("뒤집힌 배열 : " + Arrays.toString(reversed));
    }

    /**
     * 문제 10번 : 간단한 로또 번호 생성기
     */
    public void method10(){
        System.out.println("=== 간단 로또 번호 생성기 ===");

        int[] lotto = new int[6];
       // 6개의 중복되지 않은 번호 생성
        for(int i = 0; i < lotto.length; i++){
            while(true) { // 중복 검사 확인
                int randomNum = (int)(Math.random() * 45) + 1;
                boolean isDuplicated = false;
                for(int j = 0; j < i; j++){
                    if(randomNum == lotto[j]){
                        isDuplicated = true; // 랜덤번호가 기존 번호들이랑 동일하다면
                        break; // 중복을 찾았으니 for문 탈출
                    }
                }

                // 중복되지 않았다면 번호를 배열에 저장
                if(!isDuplicated){
                    lotto[i] = randomNum;
                    break;
                }

            }
        }

        // 생성된 번호 출력
        System.out.println("생성된 번호 : " + Arrays.toString(lotto));
        System.out.println("프로그램을 종료합니다.");
    }
}
