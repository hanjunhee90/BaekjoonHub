class Solution {
    public int solution(int n) {
        int answer = 0;
        // 나머지가 1인 가장 작은수를 찾으면 값을 전달하고 break해야함.
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}