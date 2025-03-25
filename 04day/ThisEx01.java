// package 04day;

class Student {
    String hakbun;
    String name;
    int age;
    
    void learn() {
        System.out.println( "learn 호출" );
    }
    void eatLunch() {
        System.out.println( "eatLunch 호출" );
        this.learn();

        System.out.println( "eatLunch 호출" + this.hakbun );
    }
}

public class ThisEx01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.hakbun = "1001";
        stu.eatLunch();
    }
}
