package TostringExample;

public class ToStringExample {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone( "삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println( strObj );

        System.out.println( myPhone.toString() );
    }
}
