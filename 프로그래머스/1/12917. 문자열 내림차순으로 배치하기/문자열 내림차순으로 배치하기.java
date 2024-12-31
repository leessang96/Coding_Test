class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        char temp = 0;
        for(int i=0; i<ch.length; i++){
            for(int j=0; j<ch.length-1; j++){
                if(ch[j] < ch[j+1]){
                    temp = ch[j+1];
                    ch[j+1] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        
        for(char c : ch){
            answer += c;
        }
        return answer;
    }
}