package set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        HashSet<String> hs2 = new HashSet<String>();

        Set<String> set1 = new HashSet<String>();

        hs1.add( "홍길동" );
        hs1.add( "임꺽정" );
        hs1.add( "장길산" );

        System.out.println( hs1.size() );
        System.out.println( hs1 );

        hs1.add( "홍길동" );
        hs1.add( "홍길동" );
        hs1.add( "이몽룡" );
        hs1.add( "이몽룡" );

        System.out.println( hs1.size() ); // 중복 자동 제거가 됨
        System.out.println( hs1 );

//        System.out.println( hs1.get() );

        // 향상된 for문을 통해서 가져오기 가능 (인덱스가 일반 for문으로는 사용불가)
        for ( String data : hs1 ) {
            System.out.println( data );
        }

        // Iterator - 반복자 // 이건 구버전 위에게 신버전
        Iterator<String> i = hs1.iterator();
        while ( i.hasNext() ) {
            System.out.println( i.next() );
        }
    }
}
