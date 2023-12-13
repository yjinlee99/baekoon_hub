import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minx = 10000, miny = 10000, maxx = -10000, maxy = -10000;
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x <= minx) minx = x;
            if(x >= maxx) maxx = x;
            if(y <= miny) miny = y;
            if(y >= maxy) maxy = y;
        }

        System.out.println(((long) (maxx - minx) * (maxy - miny)));
    }
}