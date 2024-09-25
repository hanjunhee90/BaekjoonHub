import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 1 ; i <= n; i++){
            if(i % k == 0){
                answer.add(i);
            }    
        }
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i).intValue();
        }
        return result;
    }
}