import java.io.IOException;

public class ToString {
    public static void main(String[] args) {
        
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
