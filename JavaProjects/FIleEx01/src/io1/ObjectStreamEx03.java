package io1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamEx03 {
    public static void main(String[] args) {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream( new FileOutputStream( "./object2.dat" ) );

            String data = "홍길동";
            oos.writeObject( data );

            Person p = new Person( "홍길동", "010-111-1111", 20, "서울시" );
            oos.writeObject( p );

            System.out.println( "저장 완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
            e.printStackTrace();
        } finally {
            if ( oos != null ) try { oos.close(); } catch (IOException e) { }
        }
    }
}
