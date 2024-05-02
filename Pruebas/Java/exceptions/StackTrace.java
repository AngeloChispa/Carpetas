import java.io.IOException;

/**
 * StackTrace
 */
public class StackTrace {

    public static void main(String[] args) {
        
        try{

            throw new IOException();

        }catch(IOException e){

            e.printStackTrace();

        }

    }    


}