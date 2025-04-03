package exam;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream( "./Object.dat" );
            oos = new ObjectOutputStream( fos );
            Member m1 = new Member( "fall", "단풍이" );
            Product p1 = new Product( "노트북", 1500000 );
            int[] arr1 = { 1, 2, 3 };

            oos.writeObject( m1 );
            oos.writeObject( p1 );
            oos.writeObject( arr1 );

            oos.flush(); oos.close(); fos.close();

            FileInputStream fis = new FileInputStream( "./Object.dat" );
            ObjectInputStream ois = new ObjectInputStream( fis );

            Member m2 = (Member) ois.readObject();
            Product p2 = (Product) ois.readObject();
            int[] arr2 = (int[]) ois.readObject();

            System.out.println( m2 );
            System.out.println( p2 );
            System.out.println( Arrays.toString( arr2 ) );

        } catch (IOException e) {
            System.out.println( "[에러] " + e.toString() );
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.toString() );
        } finally {
            if (oos != null) try { oos.close(); } catch ( IOException e ) {}
            if (fos != null) try { fos.close(); } catch ( IOException e ) {}
        }


    }
}
