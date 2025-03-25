class Student1 {
    String hakbun;
    String name;
    
    Student1 () {
        this.hakbun = "0000";
        this.name = "아무개";
    }

    Student1 ( String name ) {
        this.hakbun = "0000";
        this.name = name;
    }

    Student1 ( String hakbun, String name ) {
        this.hakbun = hakbun;
        this.name = name;
    }
}

public class ConstructorEx04 {
    public static void main(String[] args) {
        Student1 stu = new Student1("1003","박문수");
        System.out.println( stu.hakbun + "/" + stu.name );
    }
}
