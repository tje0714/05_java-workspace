package edu.practice.day4;

/**
 *요구사항
 * - private 필드: name(String), studentId(String), score(int)
 * - 기본생성자와 필수생성자 작성
 * - getter, setter 메서드 작성
 * - displayInfo() 메서드로 학생 정보 출력
 * - isPass() 메서드로 60점 이상이면 "합격", 미만이면 "불합격" 반환
 * *********************************************************************
 * 힌트:
 * - 클래스명: Student
 * - 필수생성자: public Student(String name, String studentId, int score)
 * - 메서드명: public void displayInfo(), public String isPass()
 * - 합격 기준: score >= 60
 *
 */
public class Student {
    private String name;
    private String studentId;
    private int score;


    public Student() {
    }

    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void displayInfo(){
        System.out.printf(" *===== 학생 정보 관리 시스템 =====\n" +
                " * 학생명: %s\n" +
                " * 학번: %s\n" +
                " * 점수: %d점\n",getName(),getStudentId(),getScore());
        System.out.println("결과 :" + isPass());

        // 같은 클래스  내에서 메서드를 호출할 때
        // 클래스명칭이나 객체 변수명칭을 생략하고 호출할 수 있다.
        // return 값이 존재할 때

    }
    public String isPass() {
        /*
            if(score >= 60) {
                return "합격"; // 각각 의 결과를 return 으로 반환
            } else {
                return "불합격";  // 각각 의 결과를 return 으로 반환
            }
        */
        return (score >= 60) ?"합격" :"불합격";

    }
/**
 *요구사항
 * - private 필드: name(String), studentId(String), score(int)
 * - 기본생성자와 필수생성자 작성
 * - getter, setter 메서드 작성
 * - displayInfo() 메서드로 학생 정보 출력
 * - isPass() 메서드로 60점 이상이면 "합격", 미만이면 "불합격" 반환
 * *********************************************************************
 * 힌트:
 * - 클래스명: Student
 * - 필수생성자: public Student(String name, String studentId, int score)
 * - 메서드명: public void displayInfo(), public String isPass()
 * - 합격 기준: score >= 60
 *===== 학생 정보 관리 시스템 =====
 * 학생명: 김자바
 * 학번: 2024001
 * 점수: 85점
 * 결과: 합격
 *
 * 학생명: 박코딩
 * 학번: 2024002
 * 점수: 45점
 * 결과: 불합격
 */
}
