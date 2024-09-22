class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // i * 6 의 값과 n을 나눳을때 나머지가 0 이면 모두 하나씩 먹었을 경우
        for (int i = 1; i <= 6 * i; i++){
            if(i*6 % n == 0 ){
                answer = i;
                break;
            }
         
        }
        return answer;
    }
}