package io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx01 {
    public static void main(String[] args) {
        // FileInputStream - byte 단위 파일 내용 읽기

        FileInputStream fis = null; //초기화

        try {
            fis = new FileInputStream( "c:/Bootcamp/data.txt" ); // 파일 열기
            System.out.println( "문자 : " + fis.read() ); // 한바이트 읽기
        } catch (IOException e) {
            System.out.println( "에러" + e.getMessage() );
        } finally {
            try { fis.close(); } catch ( IOException e ){} // 파일 닫기
        }


    }
}
