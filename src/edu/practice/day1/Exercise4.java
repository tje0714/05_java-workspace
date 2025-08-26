package edu.practice.day1;

import java.util.Scanner;

public class Exercise4 {
    // 변수이름을 선언하거나 변수이름에 데이터를 넣는 것은
    // 메서드 내부에 작성하지 않고 보통은
    // class 파일이름 바로 아래에 작성
    Scanner sc = new Scanner(System.in);
    int korean, english, math;
    double average;
    char grade;
    public void method1(){
        /**
         * - 국어, 영어, 수학 점수를 각각 입력받기
         * - 평균 점수 계산 (소수점 둘째 자리까지)
         * - 평균에 따른 학점 출력:
         *     - 90점 이상: A
         *     - 80점 이상: B
         *     - 70점 이상: C
         *     - 60점 이상: D
         *     - 60점 미만: F
         */
        System.out.print("국어점수 : ");
        korean = sc.nextInt();
        System.out.print("수학점수 : ");
        english = sc.nextInt();
        System.out.print("영어점수 : ");
        math = sc.nextInt();

        average = (korean + english + math) / 3.0;

        if (average > 90) grade = 'A';
        else if (average < 90) grade = 'B';
        else if (average < 80) grade = 'C';
        else if (average < 70) grade = 'D';
        else if (average < 60) grade = 'E';
        else  grade = 'F';

        System.out.printf("국어 점수 :  %2d \n 수학 점수 :  %2d \n 영어 점수 :  %2d \n 평균 %.2f점 \n 학점 %c",
                korean,math,english,average,grade);

    }
}
