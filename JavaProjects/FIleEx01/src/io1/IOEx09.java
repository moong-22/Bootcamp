package io1;

import java.io.FileWriter;
import java.io.IOException;

public class IOEx09 {
    public static void main(String[] args) {

        FileWriter fw = null;
        // 문장 단위로 입력이 가능해짐
        try {
            fw = new FileWriter( "./data2.txt" );

            fw.write( "Hello" );
            fw.write( "Hello" );
//            fw.write( "\r\n" );
            fw.write( System.lineSeparator() ); // 엔터
            fw.write( "Hello" );

            System.out.println( "출력 완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( fw != null ) try { fw.close(); } catch ( IOException e ) {}
        }
    }
}
