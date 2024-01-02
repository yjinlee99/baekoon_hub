import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            q.add(i);
        }

        int num = 1;

        while (!q.isEmpty()) {
            if (num % m == 0) {
                q2.add(q.poll());
            } else {
                q.add(q.poll());
            }
            num++;
        }

        System.out.print("<");
        for(int i=0; i<n-1; i++) {
            System.out.print(q2.poll() + ", ");
        }
        System.out.println(q2.poll() + ">");
    }
}
