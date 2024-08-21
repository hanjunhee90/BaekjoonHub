class Solution {
    public int solution(int n) {
        int answer = 0;
        // 주어진 n 값과 2를 나눈 나머지가 0 이면 짝수이니 그 값을
        // answer에 더하여 리턴
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
            answer += i;
            }
        }
        
        return answer;
    }
}