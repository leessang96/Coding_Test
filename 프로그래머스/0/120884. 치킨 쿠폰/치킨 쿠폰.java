class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int c = 0;
        
        while(chicken > 0){
            answer += chicken / 10;
            c += chicken % 10;
            chicken /= 10;
            
            if(c >= 10){
                answer++;
                c -= 9;
            }
        }
        return answer;
    }
}