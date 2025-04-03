package map1;

import java.util.Properties;
import java.util.Set;

public class PropertiesEx02 {
    public static void main( String[] args ) {
        System.out.println( System.getProperty( "os.name" ) );

        Properties prop = System.getProperties();

        Set<String> names = prop.stringPropertyNames();
        for( String name : names ) {
            System.out.println( name );
        }
    }
}
