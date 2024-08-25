class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        // String 의 replace는 해당 문자열에서 (찾는문자,치환할문자)
        answer = my_string.replace(letter,"");
        return answer;
    }
}