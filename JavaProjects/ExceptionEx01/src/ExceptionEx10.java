import java.io.IOException;

public class ExceptionEx10 {
    public static void main(String[] args) {
        try {
            ProcessBuilder ProcessBuilder
                    = new ProcessBuilder("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
            ProcessBuilder.start();
        } catch (IOException e) {
            System.out.println( "에러 : " + e.getMessage() );
        }

        try {
            ProcessBuilder ProcessBuilder
                    = new ProcessBuilder("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
            ProcessBuilder.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
