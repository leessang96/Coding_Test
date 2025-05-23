class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0], end = section[0] + (m-1);
		
		for(int i : section) {
			if(i >= start && i <= end) {
				continue;
			}else {
				start = i;
				end = i + (m-1);
				answer++;
			}
		}
        return answer;
    }
}