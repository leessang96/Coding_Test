class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            answer[i] = numlist[i];
        }
        
        for(int i=0; i<answer.length; i++){
            for(int j=i+1; j<answer.length; j++){
                
                int distA = Math.abs(answer[i] - n);
                int distB = Math.abs(answer[j] - n);
                
                if(distA > distB){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }else if(distA == distB && answer[i] < answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}