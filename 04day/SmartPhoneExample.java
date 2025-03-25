class Phone {
    String model;
    String color;

    void bell() {
        System.out.println( "벨이 울립니다." );
    }
    void sendVoice( String message ) {
        System.out.println( "자기 : " + message );
    }
    void receiveVoicee( String message ) {
        System.out.println( "상대방 : " + message );
    }
    void hangUp() {
        System.out.println( "전화를 끊습니다." );
    }
}

class SmartPhone extends Phone {
    boolean wifi;

    public SmartPhone( String model, String color ) {
        this.model = model;
        this.color = color;
    }
    void setwifi( boolean wifi ) {
        this.wifi = wifi;
        System.out.println( "와이파이 상태를 변경했습니다." );
    }
    void internet( boolean wifi ) {
        this.wifi = wifi;
        System.out.println( "인터넷에 연결합니다." );
    }
}

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone( "갤럭시", "은색" );

        System.out.println( "모델 : " + myPhone.model );
        System.out.println( "색상 : " + myPhone.color );

        System.out.println("와이파이 상태 : " + myPhone.wifi );

        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoicee("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.setwifi(true);
        myPhone.internet(false);
    }
}
