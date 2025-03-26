package com.exam;

public class MainEx02 {
    public static void main(String[] args) {
        // java MainEx02 abc cde efg
        System.out.println( "입력 데이터 갯수" + args.length );

        // 일반 for
        for ( int i = 0; i < args.length; i++ ) {
            System.out.println( args[i] );
        }

        // 향상된 for
        for ( String arg : args ) {
            System.out.println( arg );
        }
    }
}
