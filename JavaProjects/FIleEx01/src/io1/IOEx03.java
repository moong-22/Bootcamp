package io1;

import java.io.FileInputStream;
import java.io.IOException;

public class IOEx03 {
    public static void main( String[] args ) {

        // 엔터키 파악(\n)

        FileInputStream fis = null; // 초기화

        try {
            fis = new FileInputStream( "./data.txt" );

            int data = 0;
            while ( (data = fis.read()) != -1 ) {

                if( data == '\r' ) {
                    System.out.print( "(r)" ); // window는 \r\n 으로 엔터키
                } else if( data == '\n' ) {
                    System.out.println( "(n)");
                } else {
                    System.out.print( (char) data );
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            try { fis.close(); } catch ( IOException e ){}; // 반드시 클로즈
        }

    }
}
