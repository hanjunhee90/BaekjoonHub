def solution(arr):
    answer = 0
    # 파이썬은 길이구하려면 len(배열) 해야함.
    for i in range(len(arr)):
        answer += arr[i]
    answer /= len(arr)
    return answer