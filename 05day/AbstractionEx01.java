class Parent1 {
    Parent1() {
        System.out.println( "Parent1 호출" );
    }
}

abstract class Parent2 {
    Parent2() {
        System.out.println( "Parent2 호출" );
    }

    void viewData1() {
        System.out.println( "viewData 호출" );
    }

    // 추상메서드 - 정의가 안 된 메서드
    abstract void viewData2(); //중괄호가 없애고, 앞에 abstract를 기재 / 자식 클래스에서 오버라이딩 할 것을 전재로 함
}

class Child2 extends Parent2 {
    Child2() {
        System.out.println( "Child2 호출" );
    }

    void viewData2() {
        System.out.println( "viewData2 호출" );
    }
}

public class AbstractionEx01 {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        // Parent2 p2 = new Parent2();
        Child2 c2 = new Child2();
        c2.viewData1();

    }
}