import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int[] n = new int[3];
            n[0] = Integer.parseInt(st.nextToken());
            n[1] = Integer.parseInt(st.nextToken());
            n[2] = Integer.parseInt(st.nextToken());
            if(n[0] == 0&& n[1] ==0 &&n[2] ==0) break;

            Arrays.sort(n);
            if((n[2] >= n[1] + n[0]) || n[0] == 0) System.out.println("Invalid");
            else if(n[0] == n[1] && n[1] == n[2]) System.out.println("Equilateral");
            else if(n[0] == n[1] || n[1] == n[2] || n[0] == n[2]) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}
