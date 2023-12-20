import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int m = 1;

        Stack<Integer> stack = new Stack<>();
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(stack.empty()) {
                if(a == m) m++;
                else stack.push(a);
            } else {
                if(a==m) {
                    m++;
                    while(stack.peek() == m) {
                        stack.pop();
                        m++;
                        if(stack.empty()) break;
                    }
                } else {
                    stack.push(a);
                }

            }
        }

        if (m == n + 1) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
