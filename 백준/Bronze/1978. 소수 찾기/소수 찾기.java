import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int[] che = new int[arr[arr.length-1]+1];
        che[1] = 1;

        for(int i=2; i<=arr[arr.length-1]/2; i++){
            if(che[i] == 0){
                int j = i*2;
                int w = 2;
                while(j < che.length){
                    che[j] = 1;
                    w++;
                    j = i * w;
                }
            }
        }
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(che[arr[i]]==0){
                num++;
            }
        }
        System.out.println(num);
    }
}

