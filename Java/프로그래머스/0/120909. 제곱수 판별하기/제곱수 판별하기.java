class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // Math.sqrt 는 주어지는 변수의 제곱수를 구하는 함수
        // 제곱수를 1로 나눠 나머지가 1이면 정수 
        if(Math.sqrt(n) % 1 == 0){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}