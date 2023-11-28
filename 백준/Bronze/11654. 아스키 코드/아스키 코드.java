import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        byte[] bytes = a.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes[0]);
    }
}
