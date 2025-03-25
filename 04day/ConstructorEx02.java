class Constructor1 {
    String name;
}

class Constructor2 {
    String name;

    Constructor2() {
        name = "박문수";
    }
}

class Constructor3 {
    String name;

    Constructor3( String name ) {
        this.name = name;
    }
}


public class ConstructorEx02 {
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        c1.name = "홍길동";
        System.out.println( c1.name );
        
        Constructor2 c2 = new Constructor2();
        System.out.println( c2.name );
        
        Constructor3 c3 = new Constructor3("임꺽정");
        System.out.println( c3.name );
    }
}
