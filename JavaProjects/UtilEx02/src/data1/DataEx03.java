package data1;

import java.util.ArrayList;

public class DataEx03 {
    public static void main(String[] args) {
        Person p1 = new Person( "1", "홍길동", "010-111-1111", 20, "서울시");
        Person p2 = new Person( "2", "홍길동", "010-222-2222", 22, "경기도");
        Person p3 = new Person( "3", "홍길동", "010-222-3333", 25, "강원도");

        ArrayList<Person> datas = new ArrayList<Person>();

        datas.add(p1); datas.add(p2); datas.add(p3);

        for (Person data : datas) {
            System.out.print( data.getSeq() + '\t' );
            System.out.print( data.getName() + '\t' );
            System.out.print( data.getPhone() + '\t' );
            System.out.print( data.getAge() );
            System.out.println( data.getRegion() );
        }

    }
}
