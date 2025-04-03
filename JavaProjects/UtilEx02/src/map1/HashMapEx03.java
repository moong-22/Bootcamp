package map1;

import list1.Student;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx03 {
    public static void main(String[] args) {

        Student s1 = new Student( "1001", "홍길동" );
        Student s2 = new Student( "1002", "임꺽정" );
        Student s3 = new Student( "1003", "장길산" );

        HashMap<String, Student> hm = new HashMap<>();
        hm.put( "s1", s1 );
        hm.put( "s2", s2 );
        hm.put( "s3", s3 );

        System.out.println( hm );

        Set<String> keys = hm.keySet();
        for( String key : keys ) {
            Student student = hm.get( key );
            System.out.print( student.getHakbun() );
            System.out.println( student.getName() );
        }
    }
}
