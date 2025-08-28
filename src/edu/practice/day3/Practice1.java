package edu.practice.day3;

public class Practice1 {
    /****** 필드 = 속성 *****/
    private String title;
    private String author;
    private int price;
    private boolean isAvailable =  true; // (대출 가능 여부, 기본값 true)

    /****** 메서드 = 기능 *****/
    // 기본 생성자

    // 매개변수 생성자 에서 isAvailable 제외하고 만들기

    // Setter

    // Getter

    /**
     * 도서 반납 기능
     */
    public void returnBook(){
        if(!isAvailable) { // 대출가능하지 않은 상태인데 책을  반납했다면
            isAvailable = true; // 대출 가능한 상태로 변경하고
            System.out.println(title + "이(가) 반납되었습니다."); //반납 완료임을 작성
        } else {
            System.out.println(title + "은(는) 이미 반납된 상태입니다."); // 가능상태일 경우 반납했어! 표기

        }
    }

    /**
     * 도서 대출 기능
     */

    /**
     * 도서 정보 출력 기능
     * 대출 가능 여부 isAvailable ? "가능" : "불가능"
     */
}
