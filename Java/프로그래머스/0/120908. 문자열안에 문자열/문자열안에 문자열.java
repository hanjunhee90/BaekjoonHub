class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // contains  문자열 포함여부 확인
        if(str1.contains(str2)) {
			answer = 1;
		}else {
			answer = 2;
		}
        return answer;
    }
}