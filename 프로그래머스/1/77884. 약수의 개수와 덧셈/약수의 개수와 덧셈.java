class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i<=right; i++) {
            answer += i;
        }
        
        for(int i=1; i<=31; i++) {
            if( i*i >= left && i*i <= right) answer -= 2*i*i;
            if(i*i > right) break;
        }
        return answer;
    }
}