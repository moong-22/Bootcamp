package date1;

import java.util.Calendar;

public class CalendarEx04 {
    public static void main(String[] args) {
        int year = 2025;
        int month = 3;

        Calendar startcalendar = Calendar.getInstance();
        Calendar endcalendar = Calendar.getInstance();

        startcalendar.set( year, month-1, 1 );
        endcalendar.set( year, month, 1-1 ); // 3월 마지막 날


        int startDayOfWeek = startcalendar.get( Calendar.DAY_OF_WEEK ); // 1일의 요일
        int endDayOfWeek = endcalendar.get( Calendar.DATE ); //마지막날짜

        int endDate = endcalendar.get( Calendar.DATE );

        System.out.println( " SU MO TU WE TH FR SA");
        for ( int i=1; i<startDayOfWeek; i++ ) {
            System.out.print( "   " ); // 공백 갯수 : 3개
        }

        // i = 달력 요일 / n = 위치, n = 7 : 토요일
        for ( int i=1, n=startDayOfWeek; i<=endDate; i++, n++ ) {
            System.out.print( ( i<10 ) ? "  " + i : " " + i ); // 공백 2 / 1개
            if ( n % 7 == 0 ) {
                System.out.println();
            }
        }
    }
}
