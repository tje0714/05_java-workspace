package edu.practice.day11;

import practice.exception.ex.UserNotFoundException;

import java.util.*; // util 폴더 내 모든 문서 class 파일 가져오기

public class BankAccountManager {
    /**
    try-catch 가 없는 기능

     */
    public void method1() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = sc.nextLine();
        // 계좌번호

        Integer 해당계좌금액 =  accountMap.get(accountNumber); //accountMap 에서 계좌번호에 해당하는 금액은 숫자(Integer)에 해당
        System.out.println("해당계좌금액 : " + 해당계좌금액);
        if(해당계좌금액 == null) { //돈없음~~~ 계좌가 없어서 null
            throw  new NumberFormatException("오류 : 입력하신 계좌번호가 존재하지 않습니다.");
        }

        System.out.print("출금할 금액을 입력하세요: ");
        int 출금할금액 = sc.nextInt();
        sc.nextLine();
        if(해당계좌금액 < 출금할금액 ){
            throw  new  IllegalArgumentException("잔액이 부족합니다. " + 해당계좌금액 + " 원");

        }

    }

    /**
     * try-catch 가 있는 기능
     */
    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        try {
            System.out.print("계좌번호를 입력하세요: ");
            String accountNumber = sc.nextLine();
            // 계좌번호

            Integer 해당계좌금액 =  accountMap.get(accountNumber); //accountMap 에서 계좌번호에 해당하는 금액은 숫자(Integer)에 해당
            System.out.println("해당계좌금액 : " + 해당계좌금액);
            if(해당계좌금액 == null) { //돈없음~~~ 계좌가 없어서 null
               throw  new NumberFormatException("오류 : 입력하신 계좌번호가 존재하지 않습니다.");
            }

            System.out.print("출금할 금액을 입력하세요: ");
            int 출금할금액 = sc.nextInt();
            sc.nextLine();
            if(해당계좌금액 < 출금할금액 ){
               throw  new  IllegalArgumentException("잔액이 부족합니다. " + 해당계좌금액 + " 원");

            }

            System.out.print("계좌 번호 주인의 성함을 입력하세요 : ");
            String 계좌주인이름 = sc.nextLine();

            String 실제계좌주 = ownerMap.get(accountNumber); // 위에서 입력받은 계좌번호를 넣어서
            // 계좌주인을 찾겠다.
            System.out.println("accountNumber : " + accountNumber );
            System.out.println("계좌주인이름 : " + 계좌주인이름 );
            // accountNumber = 계좌주인이름
            if(!실제계좌주.equals(계좌주인이름) || 실제계좌주  == null) {
                throw new UserNotFoundException("일치하는 계좌의 주인이 존재하지 않습니다.");
            } else {
                accountMap.put(accountNumber, 해당계좌금액 - 출금할금액);
                System.out.println("출금이 완료되었습니다. 남은 잔액 : " + (해당계좌금액 - 출금할금액) + "원");

            }
            // 계좌번호에서 가져온 계좌 주인이 일치하는지 일치하지 않은지 확인
            // 일치하지 않으면 UserNotFoundException 을 이용해서
            // 일치하는 계좌의 주인이 존재하지 않습니다. 출력
        } catch (IllegalArgumentException e) {
            System.out.println("잔액이 부족할 때 추구 관련 작업 진행 코드 작성");
        } catch (Exception e) {
            System.out.println("더조은 은행에서 생각치 못한 문제가 발생했습니다.");
            e.printStackTrace();
        }

    }
}
