class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
       // wallet과 bill을 한번만 정렬
        //sort(wallet);
        //sort(bill);
        
        // 지갑에 지폐가 들어갈 때까지 반복
        while (!check(wallet, bill)) {
            rebill(bill);  // 지폐 크기를 줄임
            answer++;
        }
        
        return answer;
    }

    // 배열을 오름차순으로 정렬 (복사 없이 제자리 정렬)
    public void sort(int[] num) {
        if (num[0] > num[1]) {
            int temp = num[0];
            num[0] = num[1];
            num[1] = temp;
        }
    }

    // 지갑에 지폐가 들어갈 수 있는지 확인
    public boolean check(int[] wallet, int[] bill) {
        return wallet[0] >= bill[0] && wallet[1] >= bill[1] || wallet[0] >= bill[1] && wallet[1] >= bill[0];
    }

    // 더 큰 지폐의 크기를 반으로 줄임
    public void rebill(int[] bill) {
        if (bill[0] > bill[1]) {
            bill[0] /= 2;
        } else {
            bill[1] /= 2;
        }
    }
}