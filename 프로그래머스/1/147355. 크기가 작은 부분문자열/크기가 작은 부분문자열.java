import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        long pVal = Long.parseLong(p);
        
        for(int i=0; i<=t.length() - plen; i++){
            String sub = t.substring(i, i+plen);
            long subVal = Long.parseLong(sub);
            
            if(subVal <= pVal){
                answer++;
            }
        }
        
        
        return answer;
    }
}