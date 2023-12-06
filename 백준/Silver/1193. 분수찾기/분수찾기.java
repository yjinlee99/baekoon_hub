import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (true){
            if(sum >= n) break;
            sum = sum + i;
            i++;
        }
        i--;
        if (i%2 == 0){
            int loc = n - (sum - i);
            System.out.println(loc + "/" + (i - loc + 1));
        }
        else {
            int loc = n - (sum - i);
            System.out.println((i - loc + 1) + "/" + loc);
        }

    }
}
