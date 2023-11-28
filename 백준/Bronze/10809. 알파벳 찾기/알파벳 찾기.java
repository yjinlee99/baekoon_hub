import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i=0;i<a.length();i++){
            if(arr[a.charAt(i)-'a'] > -1) continue;
            arr[a.charAt(i)-'a'] = i;
        }
        for(int i=0; i<26;i++){
            System.out.print(arr[i] + " ");
        }
    }
}