package File1;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class FileEx01 {
    public static void main(String[] args) {


        File dir1 = new File( "c:\\Bootcamp" );  // 윈도우 표기법
        File dir2 = new File( "c:/Bootcamp" );  // 맥, 리눅스 표기법

        File file1 = new File( "c:\\Bootcamp\\file.txt" );
        File file2 = new File( "c:/Bootcamp/file.txt" );
        File file3 = new File( "c:/Bootcamp", "file.txt" ); // 부모자식 표기법

        File file4 = new File( "../Bootcamp/file.txt" ); // 상대경로 표기법

        // 존재유무 : exists
        System.out.println( dir1.exists() );
        System.out.println( file1.exists() );

        // 파일 / 디렉토리 구분
        System.out.println( dir1.isDirectory() );
        System.out.println( file1.isFile() );

        // 파일 / 디렉토리 성격
        System.out.println( dir2.canRead() ); // 읽기전용
        System.out.println( dir2.canWrite() ); // 쓰기가능
        System.out.println( dir2.isHidden() ); // 숨김처리

        System.out.println( dir1.getName() );
        System.out.println( dir1.getPath() );
        System.out.println( dir1.getParent() );

        File file = new File( "c:/Bootcamp/ideaIU-2024.3.5.exe" );
        System.out.println( file.getName() );
        System.out.println( file.getParent() );

        // 파일 크기
        System.out.println( file.length() + " Byte" ); // Byte 단위
        // MB 단위 변환
        System.out.println( file.length() / (1024 * 1024) + " MByte" ); // Byte 단위

        // 변경 일자 -> timestamp 값으로 나옴
        System.out.println( file.lastModified() );
        long filedate = file.lastModified();
        Date date = new Date( filedate );
        System.out.println( date.toLocaleString() );

        // Calendar 클래스로 표현
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis( filedate );
    }
}
