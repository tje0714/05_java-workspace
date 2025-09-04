package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeRun {
    // model, service, run 으로 나누지 않고 한 번에 실습
    // 메인메서드에서 모든 동작을 진행할 예정
    // 왜냐하면 List - ArrayList 를 단순히 익히기 위한 실습이기 때문에 한 번에 작성
    public static void main(String[] args) {
        // problem1(); // function javascript 처럼 기능 실행 가능
      //  problem2();
        // problem3();
       // problem4();
       // problem5();
        problem6();
    }

    // void 앞에 static이 붙는다는 것은.. 변수이름에 의하여 호출되지 않고,
    // 기능들 단독적으로 호출할 수 있도록 사용한다는 의미
    public static void problem1() {
        List<String> strList = new ArrayList<>();
        strList.add("게임");
        strList.add("독서");
        strList.add("요리");
        System.out.println(strList.size());
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
    public static void problem2() {
        List<Integer> intlist = new ArrayList<>();
        intlist.add(85);
        intlist.add(90);
        intlist.add(78);
        intlist.add(92);
        intlist.add(88);
        intlist.set(2,95);
        System.out.println(intlist);
        int target = intlist.remove(0);
        System.out.println(target);
    }
    public static void problem3() {
        List<String> menuList = new ArrayList<>();
        menuList.add("김치찌개");
        menuList.add("된장찌개");
        menuList.add("불고기");
        menuList.add("비빔밥");
        menuList.add("냉면");

        int 불고기index =  menuList.indexOf("불고기");

        System.out.println("불고기index : " + 불고기index);

        boolean 라면 = menuList.contains("라면");
        System.out.println("라면의 존재여부 : " + 라면);
        boolean 김치찌개 = menuList.contains("김치찌개");
        System.out.println("김치찌개 존재여부 : " + 김치찌개);
        String remove메뉴 =  menuList.remove(menuList.size() -1); //총 길이 -1 마지막 위치
        System.out.println("제거된 메뉴는 : " + remove메뉴);

    }
    public static void problem4() {
        List<String> strList = new ArrayList<>();
        strList.add("사과");
        strList.add("바나나");
        strList.add("우유");

        System.out.println("list size :"+strList.size());
        strList.set(1,"오렌지");
        System.out.println("오렌지 확인 :" + strList);
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("상품 " + strList.get(i));
        }
        // 1. 쇼핑 카트 리스트를 만드세요
        // 2. "사과", "바나나", "우유" 를 추가하세요
        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        // 4. 2번째 상품을 "오렌지"로 바꾸세요
        // 5. 모든 상품을 "상품: 사과", "상품: 오렌지" 형태로 출력하세요
    }
    public static void problem5() {
        List<Integer> intlist = new ArrayList<>();

        intlist.add(1);
        intlist.add(3);
        intlist.add(5);
        intlist.add(7);
        intlist.add(9);
        intlist.add(2);
        intlist.add(4);
        intlist.add(6);
        intlist.add(8);
        intlist.add(10);
        for (int i = 0; i < intlist.size(); i++) {
            if(intlist.get(i) % 2 == 0){
                System.out.println(intlist.get(i));

            }
        }
        int count = 0;
        for (int i = 0; i < intlist.size(); i++) {
            if(intlist.get(i) > 5){
                count++;

            }
        }
        System.out.println("5보다 큰 수의 개수 : " + count);

        int max = intlist.get(0);
        for (int i = 1; i < intlist.size(); i++) {
            max = Math.max(max, intlist.get(i));
        }
        System.out.println("가장 큰 수 : " + max);
        // 1. 숫자 리스트를 만들고 [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] 을 추가하세요
        // 2. 짝수만 찾아서 출력하세요 (힌트: 숫자 % 2 == 0)
        // 3. 5보다 큰 숫자의 개수를 세어보세요
        // 4. 가장 큰 숫자를 찾아서 출력하세요
    }
    public static void problem6() {
        List<String> strList = new ArrayList<>();
        strList.add("게임");
        strList.add("요리");
        strList.add("독서");
        strList.add("요리");
        strList.add("요리");
        System.out.println(strList);

        System.out.println("요리가 몇 번 째로 들어있나 ? : " + strList.indexOf("요리"));
        //   요리가 몇 번 째로 들어있나 ? : 1
        // indexOf() 는 중복된 데이터가 여러 개 있을 경우 맨 앞에 있는 index 번호만 출력

        // 요리가 들은 모든 index 를 보고 싶어요.
        for (int i = 0; i < strList.size(); i++) {
            if(strList.get(i).equals("요리")) {  // equals 는 문자열 비교하는 기능
                // equals 는 비교했을 때 동일하면 true 다르면 false
                System.out.println(i + " 번 째 위치");
            }
        }
    }
}
