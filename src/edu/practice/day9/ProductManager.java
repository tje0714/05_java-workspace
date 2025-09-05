package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductManager {
    private Map<String, String> productMap;
    private Map<String, Integer> priceMap;

    public ProductManager() {
        this.productMap = new HashMap<>();
        this.priceMap = new HashMap<>();
        initializeData();
    }

    private void initializeData() {
        productMap.put("P001", "갤럭시S24");
        priceMap.put("P001", 1200000);
        productMap.put("P002", "아이폰15");
        priceMap.put("P002", 1300000);
        productMap.put("P003", "나이키운동화");
        priceMap.put("P003", 150000);
    }

    public void addProduct(String productId, String productName, int price) {
        if (productMap.containsKey(productId)) {
            System.out.println("이미 존재하는 상품입니다!");
        } else {
            productMap.put(productId, productName);
            priceMap.put(productId, price);
            System.out.println(productName + " 상품이 추가되었습니다!");
        }
    }

    public void searchProduct(String productId) {
        if (productMap.containsKey(productId)) {
            String productName = productMap.get(productId);
            int price = priceMap.get(productId);
            System.out.println("상품ID: " + productId + ", 상품명: " + productName + ", 가격: " + price + "원");
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    public void displayAllProducts() {
        System.out.println("=== 전체 상품 목록 ===");
        if (productMap.isEmpty()) {
            System.out.println("상품이 존재하지 않습니다.");
        } else {
            Set<String> productIds = productMap.keySet();
            for (String productId : productIds) {
                String productName = productMap.get(productId);
                int price = priceMap.get(productId);
                System.out.println("상품ID: " + productId + ", 상품명: " + productName + ", 가격: " + price + "원");
            }
        }
    }

    public void removeProduct(String productId) {
        if (productMap.containsKey(productId)) {
            String productName = productMap.get(productId);
            productMap.remove(productId);
            priceMap.remove(productId);
            System.out.println(productName + " 상품이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 상품ID입니다.");
        }
    }
}