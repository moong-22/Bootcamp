package data1;

public class DataEx01 {
    public static void main(String[] args) {
        // 번호  이름      전화번호         나이  주소
        // 1    홍길동     010-111-1111    20  서울시
        // 2    박문수     010-222-2222    22  경기도
        // 3    홍길동     010-333-3333    25  강원도

        // 2차 배열로 변수화
        String[] data1 = { "1", "홍길동", "010-111-1111", "서울시" };
        String[] data2 = { "2", "박문수", "010-222-2222", "경기도" };
        String[] data3 = { "3", "임꺽정", "010-333-3333", "강원도" };

        String[][] datas = new String[3][];
        datas[0] = data1;
        datas[1] = data2;
        datas[2] = data3;

        for ( String[] data : datas ) {
            for ( String str : data ) {
                System.out.print( str + "\t" );
            }
            System.out.println();
        }

    }
}
