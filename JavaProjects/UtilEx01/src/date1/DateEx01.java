package date1;

import java.util.Date;

public class DateEx01 {
    public static void main(String[] args) {
        java.util.Date date1 = new java.util.Date();
        Date date2 = new Date();

        System.out.println( date2 );
        System.out.println( date2.toString() );
        System.out.println( date2.toLocaleString() ); //Locale = 지역적인

        //년월일만 출력하고자하면
        String strDate = date2.toLocaleString();
        System.out.println( strDate );

        System.out.print( strDate.substring( 0, 5 ) );
        System.out.print( strDate.substring( 6, 8 ) );
        System.out.println( strDate.substring( 10, 12 ) );

        System.out.println( "년 : " + ( date2.getYear() + 1900 ) );
        System.out.println( "월 : " + ( date2.getMonth() + 1 ) );
        System.out.println( "일 : " + date2.getDate() );
        System.out.println( "시 : " + date2.getHours() );
        System.out.println( "분 : " + date2.getMinutes() );
        System.out.println( "초 : " + date2.getSeconds() );

        // 일요일이 0임
        System.out.println( "요일 : " + date2.getDay() );

        // Timestamp : 0 / 1970 : 1 : 1 : 0.0.0(unix date)
        // 날짜, 시간을 1000분의 1초 단위로 기록함
        System.out.println( "timestamp : " + date2.getTime() );
        System.out.println( "timestamp : " + System.currentTimeMillis() );

    }
}
