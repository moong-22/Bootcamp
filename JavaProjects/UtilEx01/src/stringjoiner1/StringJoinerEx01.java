package stringjoiner1;

import java.util.StringJoiner;

public class StringJoinerEx01 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner( "," );
        sj1.add( "사과" );
        sj1.add( "수박" );
        sj1.add( "딸기" );
        sj1.add( "참외" );

        String data = sj1.toString();
        System.out.println( data );

    }
}
