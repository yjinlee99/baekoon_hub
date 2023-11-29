import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[][] arr1 = new char[5][15];
        String str = "";

        for (int i = 0; i < arr1.length; i++) {
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                arr1[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr1[j][i] != '\0'){
                    System.out.print(arr1[j][i]);}
            }
        }
    }
}