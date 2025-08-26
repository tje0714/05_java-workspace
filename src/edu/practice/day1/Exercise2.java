package edu.practice.day1;

import java.util.Scanner;

/**
 * 계산기 만드는 클래스
 */
public class Exercise2 {
    /*
        첫 번째 정수 입력: 10
        두 번째 정수 입력: 3

        === 계산 결과 ===
        10 + 3 = 13
        10 - 3 = 7
        10 * 3 = 30
        10 / 3 = 3.33

     */
    public void method1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();

        int add =  num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double)num1 / num2;
        /*
        Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
        나누기 : % d 가 아니라 %.2f 를 사용해야함
         */
        System.out.printf("=== 계산 결과 ===\n 더하기 : %d\n 빼기 : %d \n 곱하기 : %d \n 나누기 : %.2f ",add,sub,mul,div);
    }
}
