class Solution {
    public int solution(int a, int b) {
        int sum = 0;
        
        if(a % 2 != 0 && b % 2 != 0) {
			a *= a;
			b *= b;
			sum = a + b;
		}else if((a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0)){
			sum = 2 * (a + b);
		}else {
			sum = Math.abs(a-b);
			
		}
        
        return sum;
    }
}