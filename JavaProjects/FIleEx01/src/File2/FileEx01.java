package File2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx01 {
    public static void main(String[] args) {
        try {
            // 절대 경로를 통해서 파일/디렉토리에 대한 file 클래스 생성
            File dir1 = new File( "c:/Bootcamp/JavaProjects/FileEx01" );
            System.out.println( dir1.getAbsolutePath() );
            System.out.println( dir1.getCanonicalPath() );

            // 상대 경로 : .
            File dir2 = new File( "." );
            System.out.println( dir2.getAbsolutePath() ); // => 상대경로 위치가 나옴
            System.out.println( dir2.getCanonicalPath()); // => 절대경로 위치로 나옴

            String[] lists = dir2.list();
            System.out.println( Arrays.toString(lists) );

            File file = new File( "./data.txt" );
            System.out.println( file.exists() );

        } catch (IOException e) {
            System.out.println( "[에러] " + e.toString() );
        }
    }
}
