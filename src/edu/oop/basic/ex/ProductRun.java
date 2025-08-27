package edu.oop.basic.ex;

public class ProductRun {

    public static void main(String[] args) {
        Product pc1 = new Product();
        pc1.setpName("갤럭시S24");
        pc1.setPrice(120000);
        pc1.setBrand("삼성");
        
        Product pc2 = new Product();
        pc2.setpName("아이폰 15");
        pc2.setPrice(130000);
        pc2.setBrand("애플");

        System.out.println("=== p1 실행 결과===");
        pc1.information();

        System.out.println("=== p2 실행 결과===");
        pc2.information();
    }
}
