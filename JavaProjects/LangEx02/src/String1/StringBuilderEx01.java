package String1;

public class StringBuilderEx01 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder( 100 );
        StringBuilder sb3 = new StringBuilder( "Hello StringBuilder" );

        // 저장공간의 크기
        System.out.println( sb1.capacity() );
        System.out.println( sb2.capacity() );
        System.out.println( sb3.capacity() );

        System.out.println( sb3.length() );

        // 내부 버퍼의 문자열 조작
        // append / insert / delete
        System.out.println( sb3 );
        sb3.append( "안녕" );
        System.out.println( sb3 );
        sb3.insert(3,"추가");
        System.out.println( sb3 );
        sb3.delete( 0, 4 );
        System.out.println( sb3 );

    }
}
