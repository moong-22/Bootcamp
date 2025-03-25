class Car {
    private int speed;
    private boolean stop;
    
    int getSpeed() {
        return speed;
    }
    void setSpeed( int speed ) {
        if( speed < 0 ) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    boolean isStop() {
        return stop;
    }

    void setStop( boolean stop ) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.setSpeed( -50 );
        System.out.println( "현재 속도 : " + myCar.getSpeed() );
        
        myCar.setSpeed( 60 );
        System.out.println( "현재 속도 : " + myCar.getSpeed() );

        if ( !myCar.isStop() ) {
            myCar.setStop( true );
        }

        System.out.println( "현재속도 : " + myCar.getSpeed() );
    }
}
