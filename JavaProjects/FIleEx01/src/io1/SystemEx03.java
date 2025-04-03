package io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx03 {
    public static void main(String[] args) {

        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader( new InputStreamReader( System.in ) );

            System.out.print( "입력 : " );

//            System.out.println( "입력값 : " + (char) br.read() );
//            System.out.println( "입력값 : " + (char) br.read() );
//            System.out.println( "입력값 : " + (char) br.read() );

            System.out.println( br.readLine() );

        } catch (IOException e) {
            System.out.println( "[에러] " + e.toString() );
        } finally {
            if (br != null) try { br.close(); } catch (IOException e) {}
        }
    }
}
