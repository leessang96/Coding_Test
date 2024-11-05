import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<my_string.length(); i+=m){
            list.add(my_string.substring(i, i+m));
        }
        
        for(int i=0; i<list.size(); i++){
            answer += list.get(i).charAt(c-1);
        }
        return answer;
    }
}