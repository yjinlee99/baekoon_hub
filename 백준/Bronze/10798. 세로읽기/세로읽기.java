import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = new String[5];
        int max = 0;
        for(int i=0; i<5; i++) {
            s[i] = sc.next();
            if(s[i].length() >= max) max = s[i].length();
        }

        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++) {
                if(i < s[j].length()) {
                    System.out.print(s[j].charAt(i));
                }
            }
        }
    }
}
