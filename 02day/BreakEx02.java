// package 02day;

public class BreakEx02 {
    public static void main(String[] args) {
        int i = 1;
        outer:
        while ( i<=5 ) {
            i++;

            int j=1;
            while ( j<=5 ) {
                j++;

                if ( j==3 ) {
                    break outer;
                    // continue outer;
                }
                System.out.println( i + " / " + j );
            }
        }
    }
}
