class Solution {
    public int solution(int n) {
        // 숫자 3과 3의 배수는 뛰어 넘겨야 함
        int answer = 0, count = 0;
        
        while(count < n){
            answer++;
            if(answer % 3 == 0 || Integer.toString(answer).contains("3")){
                continue;
            }
            
            count++;
        }
        
        return answer;
    }
}