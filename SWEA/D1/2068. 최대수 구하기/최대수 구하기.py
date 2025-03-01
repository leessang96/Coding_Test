T = int(input())
for tc in range(1, T+1):
    arr = list(map(int, input().split()))

    max_v = arr[0]
    for i in range(1, len(arr)):
        if max_v < arr[i]:
            max_v = arr[i]

    print(f"#{tc} {max_v}")