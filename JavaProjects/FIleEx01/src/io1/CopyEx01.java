package io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
//            fis = new FileInputStream( "./data.txt" ); // 읽기
            fis = new FileInputStream( "./image.jpg" ); // 읽기
//            fos = new FileOutputStream( "./copy.txt" ); // 출력
            fos = new FileOutputStream( "./newimage.jpg" ); // 출력

            int data = 0;
            while ( ( data = fis.read() ) != -1 ) { // 파일 끝까지 읽어오게하기
                fos.write( data ); // 복사 문서에 내용 입력
            }

            System.out.println( "복사 완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( fis != null ) try { fis.close(); } catch ( IOException e ) {}
            if ( fos != null ) try { fos.close(); } catch ( IOException e ) {}
        }
    }
}
