import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<myString.length(); i++){
            int len  = i + pat.length();
            
            if(len <= myString.length()){
                list.add(myString.substring(i, len));
            }
        }
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).contains(pat)){
                answer++;                
            }
        }
        return answer;
    }
}