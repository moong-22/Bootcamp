package list1;

import java.util.ArrayList;

public class ArrayListEx04 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        // 문자열 정수 마음대로 넣을 수 있음
        al.add( "박문수" );
        al.add( "임꺽정" );
//        al.add( 10 );
//        al.add( 20 );

        System.out.println( al );

        // 마음대로 넣을 순 있으나, 출력시 오류가 생김
        for ( int i = 0; i < al.size(); i++ ) {
            String str = (String) al.get( i );
            System.out.println( str );
        }

        // 입력 데이터의 자료형 형식 고정 => 제네릭(generic)
        ArrayList<String> al1 = new ArrayList<>();
        al1.add( "홍길동" );
        al1.add( "임꺽정" );
//        al1.add( 10 ); // 형식을 스트링으로 고정해두어서 입력시부터 오류남


        for ( int i = 0; i < al1.size(); i++ ) {
            String str = al1.get( i ); // 이미 위에서 고정해두어서 아래에서 스트링이라고 추가로 고정할 필요가 없음
            System.out.println( str );
        }

        for ( String str : al1 ) {
            System.out.println( str );
        }
    }
}
