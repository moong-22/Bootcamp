class Parent {
    void viewParent() {
        System.out.println( "viewParent() 호출" );
    }
}

class Child extends Parent {
    void viewChild() {
        System.out.println( "viewChild() 호출" );
    }
    void viewParent() {
        System.out.println( "Child viewParent() 호출" );
        super.viewParent();
    }
}

public class InheritanceEx04 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewParent();
    }
}
