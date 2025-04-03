package list1;

import java.util.ArrayList;

public class ArrayListEx03 {
    public static void main( String[] args ) {

        ArrayList al = new ArrayList();

        // 10은 기본 자료형
        // 10 -> Integer(Autoboxing) -> Object
        // add(Object)
        al.add( 10 );
        al.add( 20 );
        System.out.println( al );

        // 이렇게 가져오면 복잡해지니
        Integer i1 = (Integer) al.get( 0 );
        System.out.println( i1.intValue() );

        //unboxing 이 방식으로 한 다는 이야기
        int i2 = (Integer) al.get( 1 );
        System.out.println( i2 );
    }
}
