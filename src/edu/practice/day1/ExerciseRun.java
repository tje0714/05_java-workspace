package edu.practice.day1;

public class ExerciseRun {
    public static void main(String[] args) {
        // 호출한 클래스와 클래스 대신 사용할 변수이름 맨 위 작성
        Exercise1 obj1 = new Exercise1();
        Exercise2 obj2 = new Exercise2();
        Exercise3 obj3 = new Exercise3();
        Exercise4 obj4 = new Exercise4();
        Exercise5 obj5 = new Exercise5();

        // 변수 이름을 활용해서 메서드 구문 작성
        //obj1.method1();
        //obj2.method1();
        //obj3.method1();
        obj4.method1();
        // obj5.method1();    // method1 기능은 띠를 출력하지 않는     기능의 버전
        //obj5.method2();     // method2 기능은 띠를 포함해서 출력하는 기능의 버전


    }
}
