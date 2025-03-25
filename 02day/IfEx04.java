// package 02day;

public class IfEx04 {
    public static void main(String[] args) {
        int hour = 11;

        if ( hour <= 12 ) {
            if ( hour <= 9 ) {
                System.out.println("아침");
            } else {
                System.out.println("아점");
            }
        } else {
            if ( hour <= 15 ) {
                System.out.println("점심");
            } else {
                System.out.println("점저");
            }
        }
    }
}
