package edu.inheritance.ex1;

/**
 * 동물 클래스 상속 실습 문제
 *
 * Animal 부모 클래스와 Dog, Cat, Bird 자식 클래스들을 활용하여
 * 상속의 개념과 메소드 오버라이딩을 연습합니다.
 */
public class AnimalInheritanceRun {

    public static void main(String[] args) {

        // ============== 문제 1: 기본 생성자 + Setter 활용 ==============
        // Dog 객체를 기본 생성자로 생성하고 setter로 다음 정보를 설정하세요.
        // 이름: "멍멍이", 나이: 3, 색깔: "갈색", 품종: "골든리트리버"

        Dog dog1 = new Dog();
        // 여기에 setter 메소드들을 사용하여 정보 설정
        dog1.setName("멍멍이");
        dog1.setAge(3);
        dog1.setColor("갈색");
        dog1.setBreed("골든리트리버");
        Cat cat1 = new Cat("야옹이",2,"흰색",true);
        Bird bird1 = new Bird("짹짹이",1,"노란색");
        Bird bird2 = new Bird("파랑이",2,"파란색",25.5);

        // ============== 문제 4: 동물 정보 출력 ==============
        System.out.println("=== 동물원 친구들 소개 ===");
        dog1.showInfo();
        cat1.showInfo();
        bird1.showInfo();
        bird2.showInfo();
        // ============== 문제 5: 공통 행동 테스트 ==============
        System.out.println("\n=== 식사 시간 ===");
        dog1.eat();
        cat1.eat();
        bird1.eat();
        bird2.eat();

        System.out.println("\n=== 잠자는 시간 ===");
        dog1.sleep();
        cat1.sleep();
        bird1.sleep();
        bird2.sleep();

        // ============== 문제 6: 오버라이딩된 메소드 테스트 ==============
        System.out.println("\n=== 동물들의 소리 ===");
        dog1.makeSound();
        cat1.makeSound();
        bird1.makeSound();
        bird2.makeSound();

        System.out.println("\n=== 동물들의 이동 ===");
        dog1.move();
        cat1.move();
        bird1.move();
        bird2.move();

        System.out.println("\n=== 동물별 특별한 행동 ===");
        dog1.wagTail();
        dog1.fetch();
        cat1.purr();
        cat1.scratch();
        bird1.fly();
        bird1.buildNest();
        bird2.fly();
        bird2.buildNest(); // build = 짓다 nest = 둥지

        // ============== 문제 8: 상속 관계 확인 ==============
        // instanceof 연산자를 사용하여 각 객체가 Animal의 인스턴스인지 확인하세요.

        System.out.println("\n=== 상속 관계 확인 ===");
        System.out.println("dog1은 Animal의 인스턴스입니다: " + (dog1 instanceof Animal));


        // ============== 문제 9: 정보 수정 후 재확인 ==============
        // dog1의 나이를 5세로, 품종을 "시바견"으로 변경한 후 정보를 다시 출력하세요.

        System.out.println("\n=== 정보 수정 후 ===");
        dog1.setAge(5);
        dog1.setBreed("시바견");
        dog1.showInfo();


        // ============== 문제 10: Super 키워드 이해 ==============

        System.out.println("\n=== Super 키워드 테스트 ===");
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("바둑이", 4, "검정색"); // 3개 매개변수 생성자
        Dog dog4 = new Dog("초코", 2, "초콜릿색", "푸들"); // 4개 매개변수 생성자

        // 각 강아지 정보 출력해보기


        // ============== 보너스 문제 1: 메소드 오버라이딩 vs 부모 메소드 ==============
        // Animal의 기본 makeSound()와 자식의 오버라이딩된 makeSound() 비교

        System.out.println("\n=== 오버라이딩 비교 ===");
        Animal animal = new Animal("동물", 1, "회색");
        animal.makeSound(); // 부모 클래스 메소드
        dog1.makeSound();   // 오버라이딩된 메소드


        // ============== 보너스 문제 2: 생성자 체이닝 ==============
        // 같은 정보를 가진 동물을 서로 다른 방식으로 생성해보세요.
        // 방식1: 기본 생성자 + setter들
        // 방식2: 매개변수 생성자

        System.out.println("\n=== 생성자 방식 비교 ===");
        // 같은 정보("토끼", 1, "흰색")를 가진 두 개의 Animal 객체를 다른 방식으로 생성


        System.out.println("\n🎉 동물원 관리 시스템 종료!");
    }
}
