class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        // array의 길이만큼 반복시켜 조건으로 n과 같을시 answer가 1씩증가하도록
        for(int i = 0; i < array.length;i++) {
			if(array[i] == n) {
				answer++;
			}
		}
        return answer;
    }
}