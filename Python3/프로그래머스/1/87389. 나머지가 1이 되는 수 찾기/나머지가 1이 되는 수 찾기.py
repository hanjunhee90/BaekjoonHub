def solution(n):

    # range(시작범위, n-1) 까지 반복  n은 인덱스라 생각하면됨,
    # 1부터 시작한 이유는 %를 할때 0이 있으면 오류생김
    for i in range(1,n):
        if n % i == 1:
            return i