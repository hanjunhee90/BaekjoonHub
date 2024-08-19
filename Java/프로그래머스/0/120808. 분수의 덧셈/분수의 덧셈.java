class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분모의 곱으로 공통 분모를 계산
        int denom = denom1 * denom2;
        // 두 분자의 합을 계산 (공통 분모를 기준으로)
        int numer = denom2 * numer1 + denom1 * numer2;
        
        // 최대공약수를 구해 기약분수로 만들기
        int gcdValue = gcd(denom, numer);
        
        // 결과 배열에 기약분수의 분자와 분모를 저장
        int[] result = new int[2];
        result[0] = numer / gcdValue; // 기약분수의 분자
        result[1] = denom / gcdValue; // 기약분수의 분모
        
        return result;
        }
    
        // 유클리드 호제법을 사용하여 최대공약수를 구하는 메소드
        public static int gcd(int n, int m) {
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
}