// package 02day;

public class LoopEx07 {
    public static void main(String[] args) {
        
        int sum = 0;

        for ( int i=1; i<=100; i+=2 ) {
            sum = sum + i;
        }

        System.out.println( sum );
    }
}
