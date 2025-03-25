class Method {
    void doFunc() {
        System.out.println( "doFunc호출" );
    }

    void doFunc( int a ) {
        System.out.println( "doFunc( int a ) 호출" );
    }

    void doFunc( String s ) {
        System.out.println( "doFunc( String s ) 호출" );
    }

    void doFunc( String s, int a ) {
        System.out.println( "doFunc( String s, int a ) 호출" );
    }

    void doFunc( int a, String s ) {
        System.out.println( "doFunc( int a, String s ) 호출" );
    }
}

public class MethodEx01 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc();
        m.doFunc(10);
        m.doFunc("가");
        m.doFunc("가",10);
        m.doFunc(10,"가");
    }
}
