package zipcode1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipcodeSearchEx01 {
    public static void main( String[] args ) {

        BufferedReader br = null;

        Scanner sc = new Scanner( System.in );
        System.out.print( "동이름 입력 > ");
        String strDong = sc.nextLine();
        sc.close();

        if ( strDong.length() < 2 ) {
            System.out.println( "동이름을 2자 이상 입력해주세요." );
            System.exit( 0 );
        }

        // 처리
        System.out.println( "정상 입력 : " + strDong );

        try {
            br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );


            String line = null;
            while ( ( line = br.readLine() ) != null ) {
                String[] addresses = line.split( "," );
                if ( addresses[3].startsWith( strDong ) ) {
//                    System.out.println( line );

                    System.out.printf( "[%s] %s %s %s %s %s\n"
                        , addresses[0], addresses[1], addresses[2]
                        , addresses[3], addresses[4], addresses[5]);

                }
            }
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }

        // 출력

    }
}
