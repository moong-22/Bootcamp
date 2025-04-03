package io1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx05 {
    public static void main(String[] args) {
//        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
//            fis = new FileInputStream( "./data.txt" );
//            bis = new BufferedInputStream( fis ); // 1차 스트림을 입력

            bis = new BufferedInputStream( new FileInputStream( "./data.txt" ) );

            int data = 0;
            while ( ( data = bis.read() ) != -1 ) { // 버퍼를 사용해서 읽어옴
                System.out.print( (char) data );
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( bis != null ) try { bis.close(); } catch ( IOException e ) {}
        }
    }
}
