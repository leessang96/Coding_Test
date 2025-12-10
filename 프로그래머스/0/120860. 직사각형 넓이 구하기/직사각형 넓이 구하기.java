class Solution {
    public int solution(int[][] dots) {
        int answer = 0, x = 0, y = 0;
        
        for(int i=1; i<dots.length; i++){
            int a = Math.abs(dots[i][0] - dots[i-1][0]);
			int b = Math.abs(dots[i][1] - dots[i-1][1]);
            if(x < a) x = a;
            if(y < b) y = b;
        }
        
        answer = x * y;
        
        return answer;
    }
}