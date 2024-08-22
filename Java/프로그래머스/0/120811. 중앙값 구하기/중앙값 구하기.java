import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        // 우선 정렬을 해준다
        Arrays.sort(array);
        // 배열이 홀수이니 길이를 2로 나누고 그 값을 반올림하여 그 위치에 있는 값 리턴
        answer = Math.round((array[array.length /2]));
        return answer;
    }
}