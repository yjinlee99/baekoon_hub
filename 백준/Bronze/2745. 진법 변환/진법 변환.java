import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int answer = 0;
        int j = 0;

        if(n == 10) System.out.println(s);
        else {
            for(int i=s.length()-1; i >=0; i--) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    answer += (int) (Math.pow(n, j) * (int) (s.charAt(i) - '0'));
                }
                else {
                    answer +=  (int) (Math.pow(n, j) * (int) (s.charAt(i) - 64 + 9));
                }
                j++;
            }
            System.out.println(answer);
        }
    }
}