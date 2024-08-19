class Solution {
    public int solution(int num1, int num2) {
        float divide = (float)num1 / (float)num2; // 100이 넘지 않은 수가 들어오느 float로 형변환 후 나눔
        int answer = (int)(divide * 1000); // 나눈 값에 1000곱한 후 다시 정수형태로 
        return answer;
    }
}