package stringjoiner1;

import java.util.Random;

public class RabdomExample {
    public static void main(String[] args) {

        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random();
        System.out.print( "선택번호 : " );
        for ( int i = 0; i < 6; i++ ) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print( selectNumber[i] + " " );
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.print( "당첨번호 : ");
        for ( int i = 0; i < 6; i++ ) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print( winningNumber[i] + " " );
        }
        System.out.println();
    }
}
