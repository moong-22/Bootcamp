package set1;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx02 {
    public static void main(String[] args) {

        Member m1 = new Member( "홍길동", 30 );
        Member m2 = new Member( "임꺽정", 32 );
        Member m3 = new Member( "정길산", 36 );

        HashSet<Member> hs = new HashSet<>();
        hs.add( m1 );
        hs.add( m2 );
        hs.add( m3 );

        System.out.println( hs ); // 순서대로 나오는게 아님

        Member m4 = new Member( "이몽룡", 35 );

        hs.add( m4 );

        // 추가 안됨
        hs.add( m1 );
        hs.add( m1 );

        Member m5 = new Member( "홍길동", 30 );
        hs.add( m5 );

        System.out.println( hs );
    }
}
