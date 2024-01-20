import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int j = 0; j < T; j++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int k = Integer.parseInt(st.nextToken());
            long n = Integer.parseInt(st.nextToken());

            if( n==k || n==0 || k==0) {
                System.out.println(1);
                continue;
            }
            long r = Math.max(n - k, k);
            long l = Math.min(n - k, k);

            for(long i=n-1; i>r; i--) {
                n = n * i;
            }
            for(long i=l-1; i>=1;i--) {
                l = l * i;
            }
            System.out.println(n/l);
        }
    }
}
