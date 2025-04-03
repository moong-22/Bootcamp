package com.exam;

public class JuminCheckEx02 {
    public static void main(String[] args) {
        if ( args.length != 1 ) {
            System.out.println( "주민번호를 입력해주세요." );
            System.exit( 0 );
        }

        if ( args[0].length() != 14 ) {
            System.out.println( "14자리를 입력해주세요." );
            System.exit( 0 );
        }

        String[] jumins = args[0].split("-");
        if ( jumins[0].length() != 6 || jumins[1].length() != 7 ) {
            System.out.println( "xxxxxx-xxxxxxx 형식으로 입력해주세요." );
            System.exit( 0 );
        }

        String strJumin = args[0].replaceAll("-", ""); // - 제거

        int sum = 0;
        int[] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

        for ( int i = 0; i < bits.length; i++ ) {
            sum += Integer.parseInt( strJumin.substring( i, i + 1 ) +bits[ i ] );
        }
        int lastNum = Integer.parseInt( strJumin.substring( 12, 13 ) );

        int resultNum = sum % 11;
        resultNum = 11 - resultNum;
        resultNum = resultNum % 10;

        if ( lastNum == resultNum ) {
            System.out.println( "정상 입력" );
        } else {
            System.out.println( "잘못된 주민번호" );
        }

    }
}
