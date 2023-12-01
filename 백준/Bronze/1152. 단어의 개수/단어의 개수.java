import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int n = 0;

        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == ' ') n++;
        }

        if(s.charAt(0) == ' ') n--;
        if(s.charAt(s.length()-1) == ' ') n--;

        System.out.println(n+1);
    }
}