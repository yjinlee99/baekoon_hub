import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            String t = br.readLine();
            map.put(i+1, t);
            map2.put(t, i+1);
        }

        for(int i=0; i<m; i++) {
            String t = br.readLine();
            if(t.charAt(0) >= '0'&& t.charAt(0) <='9') {
                System.out.println(map.get(Integer.parseInt(t)));
            } else {
                System.out.println(map2.get(t));
            }
        }
    }
}
