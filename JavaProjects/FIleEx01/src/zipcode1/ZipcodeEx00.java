package zipcode1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ZipcodeEx00 {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader( new FileReader("./zipcode_seoul_utf8_type2.csv" ));

            String line = null;
            while ( ( line = br.readLine() ) != null ) {
                System.out.println( line );


            }
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }
    }
}
