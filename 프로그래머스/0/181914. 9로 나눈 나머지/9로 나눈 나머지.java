class Solution {
    public int solution(String number) {
        String[] nArr = number.split("");
        int answer = 0;
        
        for(int i=0; i<number.length(); i++){
            answer += Integer.parseInt(nArr[i]);
        }
        
        
        return answer % 9;
    }
}