package io1;

import java.io.*;

public class CopyEx02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader( new FileReader( "./data.txt" ) );
            bw = new BufferedWriter( new FileWriter( "./copy.txt" ) );

            String line = null;
            while ( (line = br.readLine() ) != null ) {
                bw.write( line + System.lineSeparator() );
            }

            System.out.println( "출력 완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( bw != null ) try { bw.close(); } catch ( IOException e ) {}
            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }

    }
}
