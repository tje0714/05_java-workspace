package edu.exception.pack1.ex;

import java.util.Scanner;

public class PracticeException1 {
    // 단축키 : 코드 블록을 드래그 한 후 ctrl + alt + t 를 작성하면
    // if 부터 try-catch while 등 코드 블록에 대한 상황 설정을 할 수 있는
    // 블록들이 나옴
    public void method1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("두 수를 입력받아 나눈 몫 구하기");
        System.out.print("정수 입력 1 : ");
        int a=sc.nextInt();
        System.out.print("정수 입력 2 : ");
        int b=sc.nextInt();

        try {
            // 모~~든 코드를 작성하기 보다는 문제가 발생할 것 같은 구문만 주로 작성
            System.out.println("나눈 값 결과 : " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("a의 값 : " + a);
            System.out.println("b의 값 : " + b);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            // 다른 방법을 시도하시겠습니까? + 나 * 와 같은 행동을 유도할 수 있음
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
