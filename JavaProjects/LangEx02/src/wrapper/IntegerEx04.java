package wrapper;

public class IntegerEx04 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1);
        Integer i2 = 2;

        int i3 = i1;

        int sum = i1 + 20;
        System.out.println(sum);

        Integer i4 = Integer.valueOf(4 );

        int sum1 = i4 + i1;
        System.out.println(sum1);

        //숫자 공유
        Integer i11 = Integer.valueOf(11);
        Integer i12 = Integer.valueOf(11);

        System.out.println( i11 == i12 );

        //다른 장소에 저장(x)
        Integer i21 = new Integer( 11 );
        Integer i22 = new Integer( 11 );
        System.out.println(  );

    }
}
