import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        int endh, endm;

        endm = m + time;
        endh = endm/60 + h;
        endm = endm % 60;

        if(endh >= 24) endh -= 24;

        System.out.println(endh + " " + endm);
    }
}
