import java.io.BufferedReader;
import java.io.*;
public class TRYRESOURCE {

    public static void main(String[] args) throws IOException {
        
        int num = 0;

        try(BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));)
        {
            System.out.println("Enter a number:");
            num = Integer.parseInt(obj.readLine());
            System.out.println(num);
        }
    }
    
}
