class Variable {
    String instanceVariable = "홍길동";
    static String classVariable = "박문수";

    //인스턴트
    void doFunc1() {
        System.out.println( "doFunc() 호출" );

        System.out.println( this.instanceVariable );
        // System.out.println( this.classVariable );
    }

    //정적적
    static void doFunc2() {
        System.out.println( "doFunc2() 호출" );
    }
}

public class VariableEx03 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.doFunc1();
        // v.doFunc2();

        Variable.doFunc2();
    }
}
