public class DataTypeEX02 {
    public static void main(String[] args){
        // 문자=char
        // char c1=a;
        char c1='a'; // 홑따옴표로 문자 선언
        System.out.println(c1);
        
        char c2='한';
        System.out.println(c2);
        
        char c3=97; //모든 문자=영문,특수문자,숫자 => 내부적으로는 ASCII 코드로 저장
        System.out.println(c3);
        
        char c4=97+1;
        System.out.println(c4);

        char c5='\uc790'; //다국어는 유니코드로 저장 저 u가 유니콛드를 칭함
        System.out.println(c5);
        
        // char c3='한글'; //2글자 이상이면 문자열임
        // System.out.println(c3);

        String str1 ="문자열"; // 쌍따옴표로 문자열 선언언
        System.out.println(str1);
    }
}
