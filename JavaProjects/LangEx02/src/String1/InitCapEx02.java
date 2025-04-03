package String1;

public class InitCapEx02 {
    public static void main( String[] args ) {
        if ( args.length != 1 ) {
            System.out.println( "입력 오류" );
        } else {
            System.out.println("정상 입력");

            Util u = new Util( args[0] );
            System.out.println( u.capitalize() );
        }

    }
}
