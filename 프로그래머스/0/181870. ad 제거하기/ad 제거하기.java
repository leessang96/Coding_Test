import java.util.*;

class Solution {
    public String[] solution(String[] arr) {
        String[] answer = {};
        
        ArrayList<String> strArr = new ArrayList<String>();
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].contains("ad")){
                strArr.add(arr[i]);
            }
        }
        
        answer = new String[strArr.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = strArr.get(i);
        }
        
        return answer;
    }
}