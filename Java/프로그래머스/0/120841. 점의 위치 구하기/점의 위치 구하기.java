class Solution {
    public int solution(int[] dot) {
        int result = 0;
        // 각 조건에 맞게 if 문에 조건 설정
        if(dot[0] > 0 && dot[1] > 0 ) {
			result = 1;
		}else if(dot[0] < 0 && dot[1] > 0) {
			result = 2;
		}else if(dot[0] < 0 && dot[1] < 0) {
			result = 3;
		}else if(dot[0] > 0 && dot[1] < 0) {
			result = 4;
		}
        return result;
    }
}