package io1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamEx04 {
    public static void main(String[] args) {

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream( new FileInputStream( "./object2.dat" ) );

            String data = (String) ois.readObject();
            System.out.println( data );

            Person p = (Person) ois.readObject();
            System.out.println( p );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (ois != null) try { ois.close(); } catch (IOException e) {}
        }
    }
}
