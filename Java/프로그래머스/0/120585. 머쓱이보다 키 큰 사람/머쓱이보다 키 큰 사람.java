class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        // 배열의 길이만큼 반복시키고 배열에 담긴 수가 height 보다 클시 answer를 1씩 증가
        for(int i = 0; i < array.length;i++) {
			if(array[i] > height) {
				answer++;
			}
		}
        return answer;
    }
}