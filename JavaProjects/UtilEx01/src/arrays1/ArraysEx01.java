package arrays1;

import java.util.Arrays;

public class ArraysEx01 {
    public static void main(String[] args) {
        String[] strArray = { "aaa", "bbb", "ccc", "ddd", "eee" };


//        System.out.println( strArray );

//        for ( String data : strArray ) {
//            System.out.println( data );
//        }

        System.out.println( Arrays.toString( strArray ) );

        // 초기화
        Arrays.fill( strArray, "xxx" );
        System.out.println( Arrays.toString( strArray ) );

        // 부분 초기화
        Arrays.fill( strArray, 0, 2, "yyy" );
        System.out.println( Arrays.toString( strArray ) );

        // 내용값 비교
        String[] strArray1 = { "aaa", "bbb", "ccc" };
        String[] strArray2 = { "aaa", "bbb", "ccc" };

        System.out.println( strArray1 == strArray2 ); // 좌표에 대한 비교
//        System.out.println( Arrays.equals( strArray1, strArray2 ) ); // 값에 대한 비교
        if ( Arrays.equals( strArray1, strArray2 ) ) {
            System.out.println( "내용값 같음" );
        } else {
            System.out.println( "내용값 다름" );
        }


        // 정렬 sort
        int[] intArray = { 5, 2, 3, 1, 4 };

        Arrays.sort( intArray );
        System.out.println( Arrays.toString( intArray ) );

        String[] nameArray = { "xMan", "Alex", "XMan", "Bob", "Curl", "flex", "alex" };

        Arrays.sort( nameArray );
        System.out.println( Arrays.toString( nameArray ) );

        // 내용 검색(위치)
        int pos = Arrays.binarySearch( nameArray, "Cur" );
        System.out.println( pos );
    }
}
