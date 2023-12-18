import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n>0) {
            arr.add(n%3);
            n/=3;
        }
        int a = 1;
        for(int i=arr.size()-1; i>=0; i--) {
            answer += arr.get(i) * a;
            a *= 3;
        }
        return answer;
    }
}

