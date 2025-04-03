package File1;

import java.io.File;
import java.util.Arrays;

public class FileEx02 {
    public static void main(String[] args) {
        File dir = new File( "C:/Bootcamp" );
        String[] lists = dir.list();
//        System.out.println( Arrays.toString(lists) ); // Arrays.tostring = 배열 목록 확인
//        for ( String list : lists ) {
//            System.out.println( list );
//        }

        // 디렉토리만 [] 안에 출력
        for ( String list : lists ) {
//            System.out.println( list );
            File subdir = new File( "c:/Bootcamp", list );
            if ( subdir.isDirectory() ) {
                System.out.println( "[" + list + "]" );
            } else {
                System.out.println( list );
            }
        }

        //
        File[] listfile = dir.listFiles();
        for ( File file : listfile ) {
            System.out.println( file.getName() );
        }
    }
}
