import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[100][100];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=0; j<10; j++) {
                for(int z=0; z<10; z++) {
                    p[x + j][y + z] = 10;
                }
            }
        }
        int sum = 0;
        for(int i =0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(p[i][j] == 10) sum++;
            }
        }
        System.out.println(sum);

    }
}
