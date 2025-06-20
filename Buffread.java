import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffread {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter a number: ");

        InputStreamReader n = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(n);

        int num = Integer.parseInt(obj.readLine());

        System.out.println(num);
    }
}
