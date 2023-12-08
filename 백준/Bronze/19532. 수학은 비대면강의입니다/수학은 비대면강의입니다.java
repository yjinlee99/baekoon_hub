import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int d = sc.nextInt(); int e = sc.nextInt(); int f = sc.nextInt();
        int x,y;

        x = (e*c - b*f) / (a*e - b*d);
        if(b == 0) y = (f-d*x) / e;
        else y = (c-a*x) / b;

        System.out.println(x + " " + y);
    }
}
