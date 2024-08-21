class Solution {
    public int solution(int angle) {
        
        int answer = 0;
        // 각 조건을 if문에 입력해 해당 조건이면 answer 값 
        if(angle > 0 && angle < 90 ){
            answer = 1;
        }else if(angle == 90 ){
            answer = 2;
        }else if(angle > 90 && angle < 180){
            answer = 3;
        }else if(angle == 180) {
            answer = 4;
        }
        return answer;
    }
}