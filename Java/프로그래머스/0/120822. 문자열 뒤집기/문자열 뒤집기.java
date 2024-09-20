class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 반복문으로 역순으로 돌려 그대로 저장
        for(int i = my_string.length()-1; i >= 0; i--){
            answer = answer + my_string.charAt(i);
        }
        return answer;
    }
}