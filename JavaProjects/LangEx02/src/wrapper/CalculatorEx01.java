package wrapper;

public class CalculatorEx01 {
    public static void main(String[] args) {
        //입력
        //처리
        //출력

        if ( args.length != 3 ) {
            System.out.println("Usage: java CalculatorEx01 num1 num2");
        } else {
            //
            int value1 = Integer.parseInt( args[0] );
            int value2 = Integer.parseInt( args[2] );

            if ( args[1].equals("+") ) {
                System.out.println( "결과 : " + ( value1 + value2 ) );
            } else if ( args[1].equals("-") ) {
                System.out.println( "결과 : " + ( value1 - value2 ) );
            } else if ( args[1].equals("*") ) {
                System.out.println( "결과 : " + ( value1 * value2 ) );
            } else {
                System.out.println( "오류" );
            }
        }


    }
}
