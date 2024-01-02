import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        Map<String, Integer> map  = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(sc.next(), 1);
        }

        for(int i=0; i<m; i++) {
            if(map.containsKey(sc.next())) {
                result++;
            }
        }

        System.out.println(result);
    }
}