package edu.polymorphism.pack3.ex1;

/**
 * 상속 + 인터페이스
 */
public class Facebook extends Meta플랫폼 implements 소셜미디어기능들{
    public Facebook( String 유저아이디) {
        super("Facebook", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[FaceBook] 텍스트 게시물 : " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[FaceBook] 게시물 " + postId + "에 좋아요를 눌렀습니다.");
    }
}
