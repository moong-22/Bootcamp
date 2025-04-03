package date1;

import java.util.Calendar;

public class CalendarEx01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println( cal.toString() );

        // get(상수값)
        System.out.println( cal.get( Calendar.YEAR ) );
        System.out.println( cal.get( Calendar.MONTH ) +1 );
        System.out.println( cal.get( Calendar.DATE ) );

        // 일요일 : 1로 시작
        System.out.println( cal.get( Calendar.DAY_OF_WEEK ) );

        System.out.println( cal.getTimeInMillis() );
    }
}
