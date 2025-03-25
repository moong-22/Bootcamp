// package 02day;

public class WhileEx01 {
    public static void main(String[] args) {
        // int i = 1;
        // while ( i<=10 ) {
        //     System.out.println( i );
        //     i++;
        // }

        int sum = 0;
        
        int i = 1;
        while ( i<=100 ) {
            i += 2;
            sum = sum + i;
        }
        
        System.out.println( sum );

    }
}
