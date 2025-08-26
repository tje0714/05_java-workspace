package edu.practice.day1;

/**
 * 개인정보 출력 기능 작성 클래스
 */
public class Exercise1 {

    /**
     * === 개인정보 ===
     * 이름: 김자바
     * 나이: 25세
     * 키: 175.5cm
     * 성별: M
     * 취미: 프로그래밍
     */
    public void method1(){
        String name = "김자바";
        int age = 25;
        double height = 175.5;
        char gender = 'M';
        String hobby = "프로그래밍";

        System.out.printf("=== 개인 정보 ===\n이름 : %s\n나이 : %d\n키 :  %.1f\n성별 %c\n취미 : %s",name,age,height,gender,hobby);
    }

}
