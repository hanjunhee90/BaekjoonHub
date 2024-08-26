class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int count1=0;  // 짝수의 개수를 담을 그릇
		int count2=0;  // 홀수 그릇
		for(int i = 0; i < num_list.length; i++) {
            // 짝수이면 count1에 1씩 +
			if(num_list[i] % 2 == 0) {
				count1++;
			}else {
                //홀수이면 count2에 +1
				count2++;
			}
		}
		answer[0] = count1;
		answer[1] = count2;
        return answer;
    }
}