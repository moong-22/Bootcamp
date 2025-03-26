class Book1 {
    String title;
    String author;
    String price;
}
// 캡슐화
class Book2 {
    private String title;
    private String author;
    private String price;
    // constructor
    public Book2() {}
    public Book2( String title, String authur, String price) {
        this.title = title;
        this.author = authur;
        this.price = price;
    }
    // setter/getter
    public void setTitle( String title ) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor( String author ) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice( String price ) {
        this.price = price;
    }
    public String getPrice() {
        return price;
    }
}
public class ArrayEx02 {
    public static void main(String[] args) {
        Book2[] book2Array = new Book2[3];
        //Book2 book1 = new Book2();
        // 초기화 => 부분 데이터 수정정
        //book1.setTitle( "Java");
        //book1.setAuthor( "홍길동");
        //book1.setPrice( "10000" );
        // 초기화 => constructor
        //Book2 book1 = new Book2( "Java", "홍길동", "10000" );
        //Book2 book2 = new Book2( "JSP", "박문수", "15000" );
        //Book2 book3 = new Book2( "Spring", "임꺽정", "13000" );
        //book2Array[0] = book1;
        //book2Array[1] = book2;
        //book2Array[2] = book3;
        book2Array[0] = new Book2( "Java", "홍길동", "10000" );
        book2Array[1] = new Book2( "JSP", "박문수", "15000" );
        book2Array[2] = new Book2( "Spring", "임꺽정", "13000" );
        System.out.println( book2Array[0].getTitle() );
        System.out.println( book2Array[0].getAuthor() );
        System.out.println( book2Array[0].getPrice() );
    }
}