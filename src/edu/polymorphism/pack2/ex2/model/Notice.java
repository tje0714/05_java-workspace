package edu.polymorphism.pack2.ex2.model;

public class Notice  extends Post{
    private String priority;

    public Notice() {
    }

    public Notice(String postId, String title, String author, String content, String priority) {
        super(postId, title, author, content);
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    // Post 클래스에서 강제로 작성해야하는 메서드만 필히 작성하기!
    @Override
    public void displayPost() {
        System.out.println("[공지사항] {" + getTitle()+"} 작성자 : {" + getAuthor() + "} 중요도: {" + getPriority() +"} 내용 : {" + getContent() + "}");
    }
}
