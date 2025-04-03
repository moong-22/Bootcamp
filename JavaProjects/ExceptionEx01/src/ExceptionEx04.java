public class ExceptionEx04 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        int[] datas = { 0, 2, 10 };

        // ArithmeticException
        // if ~ else if ~ else ~ 형식과 유사
        try {
            int result = datas[2] / datas[1];
            System.out.println( "결과 : " + result );
        } catch (ArithmeticException e) { // 개별처리

        } catch (ArrayIndexOutOfBoundsException e) { // 개별처리

        } catch (Exception e) { // 통합처리

        }



        System.out.println( "끝" );
    }
}
