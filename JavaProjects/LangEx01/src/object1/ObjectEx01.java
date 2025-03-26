package object1;

public class ObjectEx01 {
    public static void main(String[] args) {
        // Object 클래스 생성
        Object o = new Object();

        // java.lang.Object@41629346
        // 패키지.클래스명@해시코드 : 참조주소
        System.out.println(o);
        System.out.println(o.toString());

        System.out.println(o.getClass().getName());
        System.out.println(o.hashCode());

//        Person p = new Person();
//        System.out.println(p);
//        System.out.println(p.toString());
    }
}
