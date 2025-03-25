class Parent {
    String p = "부모";
    void viewParent() {
        System.out.println( "viewParent() 호출" );
    }
}

class Child1 extends Parent {
    String c = "자식1";
    void viewChild1() {
        System.out.println( "viewChild1() 호출" );
    }
}

class Child2 extends Parent {
    String c = "자식2";
    void viewChild2() {
        System.out.println( "viewChild2() 호출" );
    }
}

public class InheritanceEx02 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.viewChild1();
        c1.viewParent();

        System.out.println( c1.c );
        System.out.println( c1.p );
        
        Child2 c2 = new Child2();
        c2.viewChild2();
        c2.viewParent();
        
        System.out.println( c2.c );
        System.out.println( c2.p );
    }    
}
