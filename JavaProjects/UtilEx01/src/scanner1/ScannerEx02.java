package scanner1;

import java.util.Scanner;

public class ScannerEx02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.print( "입력 : " );
        String msg = scanner.nextLine(); // Line으로 쓰면 하나의 단어가 아닌 문장으로 출력

        System.out.println( "입력 내용 : " + msg );

        scanner.close();
    }
}
