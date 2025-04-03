package io1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEx08 {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
//            fr = new FileReader( "./data.txt" );
//            br = new BufferedReader( fr );
            br = new BufferedReader( new FileReader( "./data.txt" ) );

            // 1자씩 읽기
//            int data = 0;
//            while ( ( data = br.read() ) != -1 ) {
//                System.out.print( (char) data );
//            }
//            System.out.println();

            // 1줄(엔터키)씩 읽기
            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println( data );
            }

        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (br != null) try { br.close(); } catch ( IOException e ) {}
            if (fr != null) try { fr.close(); } catch ( IOException e ) {}
        }
    }
}
