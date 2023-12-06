import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r, big, small;

            if(a == 1 || b == 1){
                System.out.println(a*b);
                continue;
            } else if (a==b) {
                System.out.println(a);
                continue;
            }
            if(a>b) {
                big = a;
                small = b;
            }
            else {
                big = b;
                small = a;
            }

            while(true) {
                r = big % small;
                if(r == 0) break;
                big = small;
                small = r;
            }
            System.out.println(a*b/small);
        }
    }
}
