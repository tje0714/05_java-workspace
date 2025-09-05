package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class MemberPointManager {
    private Map<String, Integer> pointMap;

    public MemberPointManager() {
        this.pointMap = new HashMap<>();
        initializeData();
    }

    private void initializeData() {
        pointMap.put("user01", 1000);
        pointMap.put("user02", 1500);
        pointMap.put("user03", 500);
    }

    public void registerMember(String memberId) {
        if (pointMap.containsKey(memberId)) {
            System.out.println("이미 존재하는 ID입니다.");
        } else {
            pointMap.put(memberId, 0);
            System.out.println(memberId + " 님이 신규 회원으로 등록되었습니다.");
        }
    }

    public void earnPoints(String memberId, int points) {
        if (pointMap.containsKey(memberId)) {
            int currentPoints = pointMap.get(memberId);
            int newPoints = currentPoints + points;
            pointMap.put(memberId, newPoints);
            System.out.println(memberId + " 님에게 " + points + " 포인트가 적립되었습니다. 현재 포인트: " + newPoints);
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    public void usePoints(String memberId, int points) {
        if (!pointMap.containsKey(memberId)) {
            System.out.println("존재하지 않는 회원 ID입니다.");
            return;
        }

        int currentPoints = pointMap.get(memberId);
        if (currentPoints >= points) {
            int remainingPoints = currentPoints - points;
            pointMap.put(memberId, remainingPoints);
            System.out.println(memberId + " 님이 " + points + " 포인트를 사용했습니다. 남은 포인트: " + remainingPoints);
        } else {
            System.out.println("포인트가 부족합니다. 현재 포인트: " + currentPoints);
        }
    }

    public void displayAllMembers() {
        System.out.println("--- 전체 회원 포인트 정보 ---");
        if (pointMap.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            for (Map.Entry<String, Integer> entry : pointMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", 포인트: " + entry.getValue());
            }
        }
    }
}