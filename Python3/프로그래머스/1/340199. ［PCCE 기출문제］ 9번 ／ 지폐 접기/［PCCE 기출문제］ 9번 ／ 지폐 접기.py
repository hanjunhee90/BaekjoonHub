def solution(wallet, bill):
    answer = 0
    # sort(reverse=True) 내림차순 (큰값부터 정렬)
    wallet.sort(reverse=True)  
    bill.sort(reverse=True)
    
    while 1:
        # 지폐와 지갑의 크기를 비교후 지폐가 크면 반으로 접음
        # 지폐가 지갑보다 값이 작아지면 반복문 멈추게
        if bill[0] > wallet[0] or bill[1] > wallet[1]:

            bill[0] = int(bill[0] / 2)
            # 다시한번 내림차순으로 정렬하여 큰값이 앞으로 오게
            bill.sort(reverse=True)
            answer += 1
        else:
            break
    return answer