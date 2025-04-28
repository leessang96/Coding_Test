from collections import deque

def bfs(start):
    global result
    visited = [[-1] * M for _ in range(N)]
    q = deque()
    visited[start[0]][start[1]] = 0
    q.append((start[0], start[1]))
    while q:
        si, sj = q.popleft()
        for d in range(4):
            ni, nj = si+di[d], sj+dj[d]
            if 0<=ni<N and 0<=nj<M and visited[ni][nj] == -1 and arr[ni][nj] == 'L':
                visited[ni][nj] = visited[si][sj] + 1
                q.append((ni, nj))
    for v in visited:
        result = max(result, max(v))



# 델타함수 - 상하좌우
# 세로 가로 크기 + 지도 정보
di, dj = [1, -1, 0, 0], [0, 0, -1, 1]
N, M = map(int, input().split())
arr = [list(input().rstrip()) for _ in range(N)]

result = 0
# 모든 육지 탐색
for i in range(N):
    for j in range(M):
        if arr[i][j] == 'L':
            bfs((i, j))

# 조합으로 모든 육지간의 거리 구하기
print(result)