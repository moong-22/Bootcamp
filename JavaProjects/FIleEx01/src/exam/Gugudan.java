package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        // 단수 1단을 입력하면, 1~9까지 전부 출력되도록 진행
        // 추가로 단수 재 요청 => 2단 입력시 다시 출력 => 또또 물어봄 => 0단 기입시 프로그램 종료

        // 힌트 : while true / break 사용

        // 구구단 입력 시스템 인 가지고 제작 / 출력을 FileOut

        BufferedReader br = null;
        try {
            while ( true ) {
                br = new BufferedReader( new InputStreamReader( System.in ) );
                System.out.print( "단수 > " );
                String dan = br.readLine();
                if ( dan.equals ( "0" ) ) {
                    System.out.println( "프로그램 종료" );
                    break;
                }

                int intDan = Integer.parseInt( dan );
                for ( int i = 1; i <= 9; i++ ) {
                    System.out.printf( "%s x %S = %s\n", intDan, i, (intDan * i) );
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }


    }
}
