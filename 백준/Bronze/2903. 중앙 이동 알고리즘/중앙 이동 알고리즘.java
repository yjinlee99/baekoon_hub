import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = 2;
        for(int i=0; i<num; i++) {
            int n = (int) Math.pow(2,i);
            m = m + n;
        }
        System.out.println((int)(Math.pow(m,2)));
    }
}
