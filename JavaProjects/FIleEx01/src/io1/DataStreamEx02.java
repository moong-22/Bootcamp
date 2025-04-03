package io1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamEx02 {
    public static void main(String[] args) {

        DataInputStream dis = null;

        try {
            dis = new DataInputStream( new FileInputStream( "./data.dat" ));

            System.out.println( dis.readInt() );
            System.out.println( dis.readUTF() );
            System.out.println( dis.readFloat() );

            System.out.println( "출력완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( dis != null ) try { dis.close(); } catch (IOException e) { }
        }

    }
}
