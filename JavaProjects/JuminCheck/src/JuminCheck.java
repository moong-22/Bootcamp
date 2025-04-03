public class JuminCheck {
    public static void main(String[] args) {

        String jumin = "000122-4029310";
        String[] data = jumin.split("-");

        if ( jumin.length() != 14 ) {
            System.out.println( "형식에 맞춰 입력해주세요." );
        } else if ( (data[0].length() != 6)&(data[1].length() != 7) ) {
            System.out.println( "형식에 맞춰 입력해주세요 " );
        } else {
            System.out.println( "정상 입력" );
        }
    }
}
