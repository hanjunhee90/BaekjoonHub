class Solution {
    public int solution(int age) {
        // 출생년도 
        int birYear = 0; 
        
        //현재 년도(문제상으로 2022년이엇으나 오류로 인해 강제로 2024로 함)
        int year = 2024;
        
        if(age > 0 && age <= 120){
            birYear = year - (age +1);
        }
      
       
        return birYear;
    }
}