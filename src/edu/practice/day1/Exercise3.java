package edu.practice.day1;

import java.util.Scanner;

/**
 * 온도 변환기 기능 클래스
 */
public class Exercise3 {
    /**
     * 섭씨온도를 입력하세요: 25.5
     * 섭씨 25.5도는 화씨 77.9도입니다.
     *
     * - `Scanner sc = new Scanner(System.in)`
     * - `double celsius` (섭씨온도)
     * - `double fahrenheit` (화씨온도)
     * - 변환 공식: `fahrenheit = celsius * 9 / 5 + 32`
     * **추가 도전**:
     *
     * - 상수(`final`)를 사용하여 변환 계수들을 정의해보세요
     *     - `final double RATIO = 9.0 / 5.0`
     *     - `final int OFFSET = 32`
     */
    // 클래스에서 변수이름을 설정할 때 제외하고 모두 메서드 형태로 작성
    public void method1(){
        Scanner sc=new Scanner(System.in);

        // 상수를 정의하는  추가 도전 문제
        final double RATIO = 9.0 / 5.0;
        final int OFFSET = 32;

        System.out.print("섭씨 온도를 입력하세요 : ");
        double celsius = sc.nextDouble();

        //double fahrenheit = celsius * 9 / 5 + 32;

        // 추가 문제 답안
        double fahrenheit = celsius * RATIO + OFFSET;

        System.out.printf("섭씨 %.1f 도는 화씨 %.1f도 입니다.",celsius,fahrenheit);
    }
}
