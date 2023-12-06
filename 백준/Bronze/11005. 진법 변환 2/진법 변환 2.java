import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        while(true) {
            arr.add(n%m);
            n /= m;
            if(n <= 0 )break;
        }
        int i = arr.size() - 1;
        while(i >= 0) {
            int a = arr.get(i);
            if(a >= 10) {
                char c = (char) ('A' + (a-10));
                System.out.print(c);
            }else System.out.print(a);

            i--;
        }
    }
}