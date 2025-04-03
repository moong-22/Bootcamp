public class LambdaEx02 {
    public static void main(String[] args) {
//        LambdaInter f1 = () -> {
//            System.out.println( "method" );
//        };
//        f1.method();

//        LambdaInter1 f1 = ( x, y ) -> {
//            System.out.println( "method" );
//        };

        LambdaInter1 f1 = ( x, y ) -> {
            return x + y;
        };

        int result = f1.method( 10, 20 );
        System.out.println( result );

        LambdaInter1 f2 = ( x, y ) -> x + y;

    }
}
