class Variable {
    String instanceVariable;
    static String classVariable;
}

public class VariableEx01 {
    public static void main(String[] args) {
        // Variable v1 = new Variable();
        // v1.instanceVariable = "10";
        // Variable.classVariable = "20";

        // System.out.println( v1.instanceVariable );

        Variable.classVariable = "30";
        System.out.println( Variable.classVariable );
    }
}
