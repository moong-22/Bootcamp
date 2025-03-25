class Parent {
    Parent() {
        System.out.println( "Parent() 호출" );
    }
    final void viewParent() {
        System.out.println( "viewParent() 호출" );
    }
}

class Child extends Parent {
    Child() {
        System.out.println( "Child() 호출" );
    }
    // void viewParent() {
    //     System.out.println( "Child viewParent() 호출" );
    // }
}

public class InheritanceEx06 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewParent();
    }
}
