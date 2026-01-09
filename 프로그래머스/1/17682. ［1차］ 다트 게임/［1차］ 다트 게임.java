class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = -1;
        String[] dr = dartResult.split("");
        
        for(int i=0; i<dr.length; i++){
            if(dr[i].matches("\\d")){
                idx++;
                int num;
                
                if(dr[i].equals("1") && i+1 < dr.length && dr[i+1].equals("0")){
                    num = 10;
                    i++;
                }else{
                    num = Integer.parseInt(dr[i]);
                }
                
                scores[idx] = num;
                
            }else if(dr[i].equals("S")){
                scores[idx] = (int)Math.pow(scores[idx], 1);
            }else if(dr[i].equals("D")){
                scores[idx] = (int)Math.pow(scores[idx], 2);
            }else if(dr[i].equals("T")){
                scores[idx] = (int)Math.pow(scores[idx], 3);
            }else if(dr[i].equals("*")){
                scores[idx] *= 2;
                if(idx-1 >= 0){
                    scores[idx-1] *= 2;
                }
            }else if(dr[i].equals("#")){
                scores[idx] *= -1;
            }
        }
        
        for(int i=0; i<scores.length; i++){
            answer += scores[i];
        }
        
        return answer;
    }
}