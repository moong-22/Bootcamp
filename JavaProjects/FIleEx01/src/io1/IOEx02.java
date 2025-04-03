package io1;

import java.io.FileInputStream;
import java.io.IOException;

public class IOEx02 {
    public static void main( String[] args ) {
        // 상대 경로를 통해서 data.txt 파일 읽기
        FileInputStream fis = null; // 초기화

        try {
            fis = new FileInputStream( "./data.txt" );

            int data = 0;
            while ( (data = fis.read()) != -1 ) {
                System.out.print( (char) data );
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            try { fis.close(); } catch ( IOException e ){}; // 반드시 클로즈
        }

    }
}
