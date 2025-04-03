public class LamdaEx03 {
    public static void main(String[] args) {
        Workable w = () -> {
            System.out.println( "출근" );
            System.out.println( "프로그래밍" );
        };

        w.work();

        Person p = new Person();
        p.action(() -> {
            System.out.println( "출근" );
            System.out.println( "프로그래밍" );
        });
    }
}
