import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr =new ArrayList<>();

        for(int i=0; i<n; i++) {
            map.put(br.readLine(), i);
        }

        for(int i=0; i<m; i++) {
            s = br.readLine();
            if(map.get(s) != null) {
                arr.add(s);
                count++;
            }
        }
        Collections.sort(arr);
        System.out.println(count);
        for(int i=0; i<count; i++) {
            System.out.println(arr.get(i));
        }
    }
}