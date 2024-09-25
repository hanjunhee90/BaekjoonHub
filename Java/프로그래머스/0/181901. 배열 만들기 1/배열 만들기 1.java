class Solution {
    public int[] solution(int n, int k) {
       
        int[] a = new int[n/k];
        
        int count = 0;
        for(int i = 1; i <= n ; i++){
             if(i % k == 0){
                a[count] = i;
                count++;
            } 
        }
        return a;
    }
}