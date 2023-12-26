import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            queue.offer(i+1);
        }
        while(true) {
            if(queue.size()==1) break;
            queue.poll();
            if(queue.size()==1) break;
            int num = queue.poll();
            queue.offer(num);
        }
        System.out.println(queue.poll());
    }
}