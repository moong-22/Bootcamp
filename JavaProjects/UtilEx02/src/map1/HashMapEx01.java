package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx01 {
    public static void main(String[] args) {

        HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>( 100 );

        Map<String, String> map = new HashMap<>();

        // 값 입력
        hm1.put( "a", "홍길동" ); // a라는 키에 홍길동을 입력
        hm1.put( "b", "임꺽정" );
        hm1.put( "c", "장길산" );

        System.out.println( hm1 );
        System.out.println( hm1.size() );

        hm1.put( "d", "이몽룡" );
        System.out.println( hm1 );

        // 수정
        hm1.put( "c", "조자룡" );
        System.out.println( hm1 );

        System.out.println( hm1.get( "a" ) );
        System.out.println( hm1.get( "b" ) );

        System.out.println( hm1.remove( "a" ) );
        System.out.println( hm1 );

        hm1.clear();
        System.out.println( hm1 );

    }
}
