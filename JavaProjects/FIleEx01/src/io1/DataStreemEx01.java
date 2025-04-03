package io1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreemEx01 {
    public static void main(String[] args) {

        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream( new FileOutputStream( "./data.dat" ));

            dos.writeInt( 2025 );
            dos.writeUTF( "UTF-8 형으로 저장" );
            dos.writeFloat( 1.8f );

            System.out.println( "출력 완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( dos != null ) try { dos.close(); } catch (IOException e) { }
        }

    }
}
