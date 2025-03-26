class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;    
        // 알아보지 못하게 된 번호의 개수를 담을 변수 선언
        int zeroCount = 0;

        // 로또번호를 foreach문으로 돌려 알아보지 못하는 번호이면 zeroCount 값 1씩 증가
        // 로또 번호가 끝날 때 까지 계속 탐색하도록 continue
        for(int lotto: lottos){
            if(lotto == 0) {
                zeroCount ++;
                continue;
            }
            // 알아보지 못하는 번호(0)가 아닐 경우,
            // 당첨번호와 민우의 번호를 비교하여 일치할 경우 count 값 1씩 증가 후 for문 탈출
            for(int win_num:win_nums){
                if(win_num == lotto){
                    count ++;
                    break;
                }
            }
        }
        // 최고 순위
        // count+zeroCount값이 가질 수 있는 범위는 0~6이므로 7에서 빼도록 함
        // count+zeroCount값이 0이어도 7등은 없으므로 6등을 반환 할 수 있도록 함
        answer[0] = Math.min(7-(count+zeroCount),6);

        // 최저 순위        
        // count값이 가질 수 있는 범위는 0~6이므로 7에서 빼도록 함
        // count값이 0이어도 7등은 없으므로 6등을 반환 할 수 있도록 함
        answer[1] = Math.min(7-count,6);   
        
        return answer;
    }
}