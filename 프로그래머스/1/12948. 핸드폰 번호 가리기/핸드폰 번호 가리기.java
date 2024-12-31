class Solution {
    public String solution(String pNum) {
        String answer = "";
        
        for(int i=0; i<pNum.length(); i++){
            if(i < pNum.length()-4){
                answer += "*";
            }else{
                answer += pNum.charAt(i);
            }
        }
        return answer;
    }
}