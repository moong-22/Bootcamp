public class OperatorEx03 {
    public static void main(String[] args) {
        int i1 = 1000000;
        System.out.println(i1);
        
        int i2 = 1_000_000; // 가독성을 위해 사용 언더바도 정수로 처리됨
        System.out.println(i2);

        //오버플로우
        int product = i1 * i2; // 길어지면서 - 처리가 남 -> 시스템상 오류가 나지 않기 때문에 조심해야함
        
        //산술연산자
        long product2 = i1 * (long)i2; // 너무 길면 한계가 있어서 long 처리 해서 표기
        System.out.println(product);
        System.out.println(product2);

        int il1 = 10;
        int il2 = 20;
        int sum1 = il1 + il2;
        System.out.println(sum1);
        
        short s1 = 10;
        short s2 = 20;
        int sum2 = s1 + s2;
        System.out.println(sum2);



    }
}
