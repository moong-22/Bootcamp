package scanner1;

import java.util.Scanner;

public class GugudanEx01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "단수 입력 : " );
        String dan = scanner.next();

        int dansu = Integer.parseInt( dan.replace( "단", "" ) );

        for ( int i = 1; i <= 9; i++ ) {
            System.out.println( dansu + " * " + i + " = " + dansu * i );
        }

        scanner.close();

    }
}
