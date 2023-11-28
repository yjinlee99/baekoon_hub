import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, max_x=0, max_y=0;
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                int a = sc.nextInt();
                if(a >= max) {
                    max = a;
                    max_x = i+1;
                    max_y = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(max_x + " " + max_y);
    }
}