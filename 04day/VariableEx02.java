class Variable {
    String instanceVariable;
    static String classVariable;
}

public class VariableEx02 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";

        System.out.println( v1.instanceVariable );
        System.out.println( v2.instanceVariable );
        
        // v1.classVariable = "임꺽정";
        // System.out.println( v1.classVariable );
        // System.out.println( v2.classVariable );
        System.out.println( Variable.classVariable );

    }
}
