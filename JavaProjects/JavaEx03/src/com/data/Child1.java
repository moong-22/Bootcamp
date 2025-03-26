package com.data;

public class Child1 extends Parent {
    public Child1() {
        System.out.println( "Hello Child1" );
    }
    // @~~ : annotation : 컴파일러 알림 기능
    @Override
    public void viewParent() {
        System.out.println( "Child1 viewParent 호출" );
    }
}
