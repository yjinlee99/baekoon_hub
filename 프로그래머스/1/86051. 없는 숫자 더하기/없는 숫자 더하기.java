import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int num = 0;
        Arrays.sort(numbers);
        for(int i = 0; i<10; i++) {
            if(numbers[num] == i) {
                if(num < numbers.length - 1) num++;
            }
            else answer += i;
        }
        return answer;
    }
}