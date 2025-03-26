package object1;

public class ObjectEx02 {
    public static void main(String[] args) {
        String s = new String( "Hello World!" );
        System.out.println( s );
        System.out.println( s.toString() );

        Person p = new Person( "홍길동", 20 );
        System.out.println( p.toString() );
    }
}
