class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String res = s.replaceAll("[a-zA-Z]", " ");
        
        if(s.length() == 4 || s.length() == 6){
            if(res.contains(" ")){
                answer = false;
            }else{
                answer = true;
            }    
        }else{
            answer = false;
        }
        

        
        
        
        return answer;
    }
}