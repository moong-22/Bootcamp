package String1;

public class StringEx02 {
    public static void main( String[] args ) {
        // String 메서드의 사용법

        String str1 = "Hello String Hello String";

        System.out.println( "문자열의 길이 : " + str1.length() );
        System.out.println( "문자열의 길이 : " + "Hello".length() );

        char ch1 = str1.charAt( 0 );
        System.out.println( ch1 );

        char ch2 = str1.charAt( 1 );
        System.out.println( ch2 );

        char ch3 = str1.charAt( str1.length()-1 );
        System.out.println( ch3 );

        // 문자열 -> 부분 문자열
        String pstr1 = str1.substring( 2);
        System.out.println( pstr1 );

        String pstr2 = str1.substring( 2, 4 );
        System.out.println( pstr2 );

        String pstr3 = str1.substring( 13, 18 );
        System.out.println( pstr3 );

        //문자열의 위치
        int pos1 = str1.indexOf( "l" );
        System.out.println( pos1 );

        int pos2 = str1.indexOf( "o", 5 );
        System.out.println( pos2 );
    }
}
