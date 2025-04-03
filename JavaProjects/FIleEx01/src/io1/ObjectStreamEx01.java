package io1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamEx01 {
    public static void main(String[] args) {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream( new FileOutputStream( "./object1.dat" ) );

            String[] names = { "홍길동", "임꺽정", "장길산" };
            int[] ages = { 18, 18, 18 };
            double[] weights = { 71.4, 67.9, 58.6 };

            oos.writeObject( names );
            oos.writeObject( ages );
            oos.writeObject( weights );

            System.out.println( "출력 완료" );
        } catch (IOException e) {
            System.out.println( "[오류] " + e.getMessage() );
        } finally {
            if ( oos != null ) try { oos.close(); } catch (IOException e) { }
        }
    }
}
