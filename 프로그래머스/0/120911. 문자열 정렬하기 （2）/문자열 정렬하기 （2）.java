import java.util.*;

class Solution {
    public String solution(String my_string) {
        String n = my_string.toLowerCase();
        char[] chArr = n.toCharArray();
        
        Arrays.sort(chArr);
        
        String answer = new String(chArr);
        
        return answer;
    }
}