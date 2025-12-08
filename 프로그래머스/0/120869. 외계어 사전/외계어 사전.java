class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        
        for(String d : dic){
            for(String s : spell){
                if(d.contains(s)) count++;
            }
            if(count == spell.length){
                answer = 1;
                break;
            }else{
                answer = 2;
                count = 0;
            }
            
        }
        return answer;
    }
}