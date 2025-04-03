public class ExceptionEx09 {
    public void method1 ( int num ) {
        System.out.println( "시작" );

        if ( num >= 100 ) {
            System.out.println( "정상" );
        } else {
            System.out.println( "비정상 입력" );
        }

        System.out.println( "끝" );
    }
    public void method2 ( int num ) {
        System.out.println( "시작" );

        try {
            if ( num >= 100 ) {
                System.out.println( "정상" );
            } else {
                throw new Exception( "100이상 입력해주세요" );
            }
        } catch ( Exception e ) {
            System.out.println( e.getMessage() );
        }

        System.out.println( "끝" );
    }
    public void method3 ( int num ) throws Exception {
        System.out.println( "시작" );
        if ( num >= 100 ) {
            System.out.println( "정상" );
        } else {
            throw new Exception( "100이상 입력해주세요" );
        }
        System.out.println( "끝" );
    }
    public static void main(String[] args) {
        System.out.println( "시작" );
        ExceptionEx09 ex = new ExceptionEx09();
        ex.method1( 10 );
        ex.method2( 10 );

        try {
            ex.method3( 100 );
        } catch ( Exception e ) {
            System.out.println( e.getMessage() );
        }


    }
}
