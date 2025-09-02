package edu.practice.day6;

public class  NaverBlog extends NaverService {
    private int postCount;
    private int visitorCount ;

    public NaverBlog() {
    }

    public NaverBlog(int postCount, int visitorCount) {
        this.postCount = postCount;
        this.visitorCount = visitorCount;
    }

    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel, int postCount, int visitorCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.postCount = postCount;
        this.visitorCount = visitorCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }
    @Override
    public void search() {
        System.out.println("블로그에서 포스트를 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("블로그 포스트를 작성합니다.");
    }


    public void addNeighbor(){
    }

    public void customizeTheme(){
    }
}

