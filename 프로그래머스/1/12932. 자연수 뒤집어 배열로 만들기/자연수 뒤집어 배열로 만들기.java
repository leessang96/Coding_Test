class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        
        int idx = 0;
        for(int i=str.length()-1; i>=0; i--){
            answer[idx++] = str.charAt(i) - '0';
        }
        return answer;
    }
}