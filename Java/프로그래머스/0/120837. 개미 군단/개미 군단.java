class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer = hp / 5 ;   // 필요 장군개미5수를 answer에 저장
        
        hp = hp % 5 ;       // hp를 5로 나눈 나머지값 hp에 재할당
        
        answer += hp / 3;   // 장군개미5의 수에 필요 병정개미3 더함
        hp %= 3;            // hp값을 재 할당
        answer += hp;       // 남은 hp값은 일개미 수 이니 answer에 더함
        return answer;
    }
}