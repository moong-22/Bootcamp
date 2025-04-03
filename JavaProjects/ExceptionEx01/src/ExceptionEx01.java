public class ExceptionEx01 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        int num1 = 10;
        int num2 = 0;

        // RuntimeException
        // 전통적인 Exception 처리 방법 - if => 고급 에러 처리 기법
        if ( num2 != 0 ) {
            int result = num1 / num2;
            System.out.println( "결과 : " + result );
        } else {
            System.out.println( "0으로 나눌 수 없습니다." );
        }


        System.out.println( "끝" );
    }
}
