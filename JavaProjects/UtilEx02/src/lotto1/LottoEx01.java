package lotto1;

import java.util.ArrayList;

public class LottoEx01 {
    public static void main(String[] args) {
        for ( int i = 0; i <= 5; i++ ) {
            ArrayList<String> lottos = new ArrayList<>();

            lottos.add( i + "회");

            for ( int j = 0; j <= 6; j++ ) {
                lottos.add ( (int) ( Math.random() *45 ) + 1 + "" );
            }

            System.out.println( lottos );
        }

    }
}
