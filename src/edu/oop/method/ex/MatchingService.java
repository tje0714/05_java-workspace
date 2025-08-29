package edu.oop.method.ex;


import java.util.Scanner;

/**
 * 결혼정보회사 회원 관리 서비스 클래스
 */
public class MatchingService {

    public void displayMenu() {
        int input;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 더조은 결혼정보회사 관리 시스템 ===");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 확인");
            System.out.println("3. 회원 정보 수정");
            System.out.println("0. 프로그램 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1: registerNewMember(); break;
                case 2: viewMemberInfo(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // memberName Service 아래에 객체 하나라도 필드형태로 만들기
    // --- 기능 메서드 ---
    public void registerNewMember() {
        if (checkAgeValid()) {
            totalMemberCount++;
            System.out.println(memberName + "님이 회원가입하셨습니다. (회원ID: " + memberId + ")");
        } else {
            System.out.println("가입 연령 기준(" + MIN_AGE_LIMIT + "세 ~ " + MAX_AGE_LIMIT + "세)에 맞지 않아 등록이 취소됩니다.");
        }
    }

    public boolean checkAgeValid() {
        return this.age >= MIN_AGE_LIMIT && this.age <= MAX_AGE_LIMIT;
    }
    public void viewMemberInfo() {
        System.out.println("--- 회원 정보 ---");
        System.out.printf("ID: %s, 이름: %s, 나이: %d세, 성별: %c, 직업: %s, 매칭점수: %d점\n",
                this.memberId, this.memberName, this.age, this.gender, this.job, this.matchingScore);
    }

}
