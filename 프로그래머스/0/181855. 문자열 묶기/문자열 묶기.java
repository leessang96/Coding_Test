class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lenArr = new int[31];
        
        for(int i=0; i<strArr.length; i++){
            lenArr[strArr[i].length()]++;
        }
        
        for(int n : lenArr){
            if(answer < n){
                answer = n;
            }
        }
        
        return answer;
    }
}