class Airplane {
    void land() {
        System.out.println("착륙합니다.");
    }
    void fly() {
        System.out.println("일반 비행합니다.");
    }
    void takeOff() {
        System.out.println("이륙합니다.");
    }
}

class SupersonicAirplane extends Airplane {
    static final int NORMAL = 1;
    static final int SUPERSONIC = 2;

    int flyMode = NORMAL;

    @Override
    void fly() {
        if ( flyMode == SUPERSONIC ) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }

}

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();        
    }
}
