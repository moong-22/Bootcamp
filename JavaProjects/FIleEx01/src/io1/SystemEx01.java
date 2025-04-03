package io1;

import java.io.IOException;
import java.io.InputStream;

public class SystemEx01 {
    public static void main(String[] args) {

        InputStream is = null;

        try {
            is = System.in;
            System.out.print( "입력 : " );
            System.out.println( "입력값 : " + (char) is.read() );
            System.out.println( "입력값 : " + (char) is.read() );
            System.out.println( "입력값 : " + (char) is.read() );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.toString() );
        } finally {
            if (is != null) try { is.close(); } catch (IOException e) {}
        }
    }
}
