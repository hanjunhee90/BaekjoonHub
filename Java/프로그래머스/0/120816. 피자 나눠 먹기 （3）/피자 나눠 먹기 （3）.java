class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        // i * slice 의 값과 n을 나눈 나머지가 1 이상이면 1조각씩은 먹었을 경우니 그대로 값 리턴
        for(int i = 1; i <= slice * n; i++){
            if(i * slice / n  >= 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}