package File1;

import java.io.File;

public class FileEx04 {
    public static void main(String[] args) {
        File file1 = new File( "c:/Bootcamp/test1.txt" );

        // 파일 생성
//        try {
//            if ( file1.createNewFile() ) {
//                System.out.println( "생성 성공" );
//            } else {
//                System.out.println( "생성 실패" );
//            }
//        } catch ( Exception e ) {
//            System.out.println( "오류 발생" );
//        }


        // 파일 변경
        File file2 = new File( "c:/Bootcamp/test2.txt" );
//        if ( file1.renameTo( file2 ) ) {
//            System.out.println( "변경 성공" );
//        } else {
//            System.out.println( "변경 실패" );
//        }
//

        // 파일 삭제
        if ( file2.delete() ) {
            System.out.println( "삭제 성공" );
        } else {
            System.out.println( "삭제 실패" );
        }
    }
}
