public class ExceptionEx05 {
    public static void main(String[] args) {

        System.out.println( "시작" );

        System.out.println( "1" );

        try {
            System.out.println( "2" );

            int[] datas = { 0, 2, 10 };
            System.out.println( datas[0] );
            System.out.println( datas[1] );
            System.out.println( datas[10] );

            System.out.println( "3" );
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( "4" );
        }
        System.out.println( "5" );

        System.out.println( "끝" );

    }
}
