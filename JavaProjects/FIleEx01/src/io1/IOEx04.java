package io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx04 {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {
            // 파일이 없으면 파일을 자동생성
            fos = new FileOutputStream( "./data2.txt" );

//            fos.write( 65 ); // ascii 코드로 입력
//            fos.write( 'a' ); // 문자 형식만 지원

            fos.write( 'a' );
            fos.write( 'b' );
            fos.write( 'c' );
            fos.write( '\t' );
            fos.write( 'd' );
            fos.write( 'e' );
            fos.write( 'f' );
            fos.write( '\r' );
            fos.write( '\n' );
            fos.write( 'g' );
            fos.write( 'h' );
            fos.write( 'i' );


            System.out.println( "출력 완료" );
        } catch ( IOException e ) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            try { fos.close(); } catch ( Exception e ) {}
        }
    }
}
