interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume( int volume );
}

class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println( "TV를 켭니다." );
    }
    
    @Override
    public void turnOff() {
        System.out.println( "TV를 끕니다." );
    }

    @Override
    public void setVolume( int volume ) {
        if ( volume > RemoteControl.MAX_VOLUME ) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if ( volume < RemoteControl.MIN_VOLUME ) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println( "현재 TV 볼륨 : " + this.volume );
    }
}

class Audio implements RemoteControl {
    private int volume;
    
    @Override
    public void turnOn() {
        System.out.println( "Audio를 켭니다." );
    }
    
    @Override
    public void turnOff() {
        System.out.println( "Audio를 끕니다." );
    }

    @Override
    public void setVolume( int volume ) {
        if ( volume > RemoteControl.MAX_VOLUME ) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if ( volume < RemoteControl.MIN_VOLUME ) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println( "현재 Audio 볼륨 : " + this.volume );
    }
}

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume( 5 );
        rc.turnOff();
        
        rc = new Audio();
        rc.turnOn();
        rc.setVolume( 5 );
        rc.turnOff();
    }
}
