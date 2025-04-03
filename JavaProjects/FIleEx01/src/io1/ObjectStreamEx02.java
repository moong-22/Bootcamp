package io1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectStreamEx02 {
    public static void main( String[] args ) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream( new FileInputStream("./object1.dat" ) );

            String[] names = (String[]) ois.readObject();
            System.out.println( Arrays.toString( names ) );
            System.out.println( "완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( ois != null ) try { ois.close(); } catch (IOException e) { }
        }
    }
}
