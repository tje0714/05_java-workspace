package edu.polymorphism.pack2.ex2.model;

public class Question extends Post {
    private int answerCount;

    public Question() {
    }

    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
        this.answerCount = 0; // answerCount 응답개수의 경우 소비자한테 전달 받는 것이 아닌 개발자가 첫 응답개수를 지정
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    @Override
    public void displayPost() {
        System.out.println("[Q&A] {" + getTitle()+"} 작성자 : {" + getAuthor() + "} 답변개수: {" + getAnswerCount() +"}개 내용 : {" + getContent() + "}");
    }
}
