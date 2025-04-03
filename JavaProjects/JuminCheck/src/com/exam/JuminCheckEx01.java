package com.exam;

public class JuminCheckEx01 {
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


//        내가 한거
//        int data1 = Integer.parseInt(strJumin.substring( 0,1 ));
//        int data2 = Integer.parseInt(strJumin.substring( 1,2 ));
//        int data3 = Integer.parseInt(strJumin.substring( 2,3 ));
//        int data4 = Integer.parseInt(strJumin.substring( 3,4 ));
//        int data5 = Integer.parseInt(strJumin.substring( 4,5 ));
//        int data6 = Integer.parseInt(strJumin.substring( 5,6 ));
//        int data7 = Integer.parseInt(strJumin.substring( 6,7 ));
//        int data8 = Integer.parseInt(strJumin.substring( 7,8 ));
//        int data9 = Integer.parseInt(strJumin.substring( 8,9 ));
//        int data10 = Integer.parseInt(strJumin.substring( 9,10 ));
//        int data11 = Integer.parseInt(strJumin.substring( 10,11 ));
//        int data12 = Integer.parseInt(strJumin.substring( 11,12 ));
//        int data13 = Integer.parseInt(strJumin.substring( 12,13 ));
//
//
//        int gob1 = data1 * 2;
//        int gob2 = data2 * 3;
//        int gob3 = data3 * 4;
//        int gob4 = data4 * 5;
//        int gob5 = data5 * 6;
//        int gob6 = data6 * 7;
//        int gob7 = data7 * 8;
//        int gob8 = data8 * 9;
//        int gob9 = data9 * 2;
//        int gob10 = data10 * 3;
//        int gob11 = data11 * 4;
//        int gob12 = data12 * 5;
//
//        int sum = gob1 + gob2 + gob3 + gob4 + gob5 + gob6 + gob7 + gob8 + gob9 + gob10 + gob11 + gob12;
//        int per1 = sum % 11;
//        int minus = 11 - per1;
//        int per2 = minus % 10;
//
//        if ( per2 != data13 ) {
//            System.out.println( "정상적인 주민번호가 아닙니다." );
//            System.exit( 0 );
//        }

        // 강사님
        int num01 = Integer.parseInt( strJumin.substring( 0, 1 ) ) * 2;
        int num02 = Integer.parseInt( strJumin.substring( 1, 2 ) ) * 3;
        int num03 = Integer.parseInt( strJumin.substring( 2, 3 ) ) * 4;
        int num04 = Integer.parseInt( strJumin.substring( 3, 4 ) ) * 5;
        int num05 = Integer.parseInt( strJumin.substring( 4, 5 ) ) * 6;
        int num06 = Integer.parseInt( strJumin.substring( 5, 6 ) ) * 7;
        int num07 = Integer.parseInt( strJumin.substring( 6, 7 ) ) * 8;
        int num08 = Integer.parseInt( strJumin.substring( 7, 8 ) ) * 9;
        int num09 = Integer.parseInt( strJumin.substring( 8, 9 ) ) * 2;
        int num10 = Integer.parseInt( strJumin.substring( 9, 10 ) ) * 3;
        int num11 = Integer.parseInt( strJumin.substring( 10, 11 ) ) * 4;
        int num12 = Integer.parseInt( strJumin.substring( 11, 12 ) ) * 5;

        int lastNum = Integer.parseInt( strJumin.substring( 12, 13 ) );

        int sum = num01 + num02 + num03 + num04 + num05 + num06 + num07 + num08 + num09 + num10 + num11 + num12;

        int resultNum = sum % 11;
        resultNum = 11 - resultNum;
        resultNum = resultNum % 10;

//        System.out.println( lastNum );
//        System.out.println( resultNum );

        if ( lastNum == resultNum ) {
            System.out.println( "정상 입력" );
        } else {
            System.out.println( "잘못된 주민번호" );
        }

    }
}
