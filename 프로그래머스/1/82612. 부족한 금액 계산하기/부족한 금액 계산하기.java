class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        int n = price;
        for(int i=1; i<=count; i++){
            answer += price;
            price += n;
        }
        
        if(answer > money){
            answer -= money;
        }else{
            answer = 0;
        }

        return answer;
    }
}