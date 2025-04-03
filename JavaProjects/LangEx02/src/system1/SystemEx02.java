package system1;

public class SystemEx02 {
    public static void main(String[] args) {
        // 프로그램의 강제 중지

        System.out.println( "시작" );

        //입력값 검사 오류인 경우 바로 종료되기 때문에 else 없이 간단화 가능
        if ( args.length != 1 ) {
            System.out.println( "에러 : 값 1개를 입력하셔야 합니다." );

            System.exit( 0 ); //프로그램 중지
        }

        System.out.println( "정상 입력" );

        System.out.println( "끝" );
    }
}
