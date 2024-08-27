import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        //Arrays.copyOfRange (원본배열, 자를위치, 어디까지 자를것인지?)
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}