class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        // 정수n의 크기만큼 반복문을 돌려 홀수 갯수 구함
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 != 0) {
				count++;
			}		
		}
        // 구한 개수만큼 리턴 할 배열크기 지정
		answer = new int[count];
		
		int count1 = 0;
        //배열에 순서대로 홀수 값 저장 
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				answer[count1] = i;
				count1++;
			}
		}		
		
        return answer;
    }
}