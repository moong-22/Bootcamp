package object1;

public class ObjectEx03 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 2;
        System.out.println( a1 == a2 );

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println( o1 );
        System.out.println( o2 );
        System.out.println( o1 == o2 );
        System.out.println( o1.equals( o2 ) );

        String s1 = new String( "Hello" );
        String s2 = new String( "Hello" );

        System.out.println( s1 == s2 );
        System.out.println( s1.equals( s2 ) );

    }
}
