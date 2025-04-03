package String1;

public class Util {
    private String strname;
    public Util( String strname ) {
        this.strname = strname;
    }

    public String capitalize() {
        String[] names = strname.split( " " );

        for ( int i = 0; i < names.length; i++ ) {
            names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring( 1 );
        }

        return String.join( " ", names );
    }
}
