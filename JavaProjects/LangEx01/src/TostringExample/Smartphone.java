package TostringExample;

public class Smartphone {
    private String company;
    private String os;

    public Smartphone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
