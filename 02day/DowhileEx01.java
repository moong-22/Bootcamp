// package 02day;

public class DowhileEx01 {
    public static void main(String[] args) {
        // int i = 1;
        // do {
        //     System.out.println( i );
        //     i++;
        // } while ( i<=10 );

        int sum = 0;

        int i = 1;
        do {
            i++;
            if ( i % 3 == 0 ) {
                sum = sum + i;   
            }
        } while ( i<=100 );

        System.out.println( sum );
    }
}
