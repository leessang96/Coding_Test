class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int i = x;
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        if(i % sum == 0){
            return answer;
        }else{
            return false;    
        }
        
    }
}