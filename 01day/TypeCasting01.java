public class TypeCasting01 {
    public static void main(String[] args) {
        // 자동형 변환 = 작은 -> 큰거거
        short s1 = 10;
        int i1 = s1;
        System.out.println(i1);

        float f1 = 10.0f;
        double d1 = f1;
        System.out.println(d1);
        
        char c1='A';
        int i2=c1;
        System.out.println(i2);
        
    }
}
