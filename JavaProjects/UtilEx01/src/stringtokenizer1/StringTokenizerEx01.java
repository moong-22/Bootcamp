package stringtokenizer1;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
    public static void main( String[] args ) {
        String srtData1 = "사과 참외 수박 딸기"; // 데이터의 공백이 있으면 자동으로 자름

        StringTokenizer st1 = new StringTokenizer(srtData1);

        System.out.println( st1.countTokens() ); // token의 갯수

//        System.out.println( st1.nextToken() );
//        System.out.println( st1.nextToken() );
        while ( st1.hasMoreTokens() ) {
            System.out.println( st1.nextToken() );
        }
    }
}
