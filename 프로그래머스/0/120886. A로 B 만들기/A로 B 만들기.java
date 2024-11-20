import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beArr = before.toCharArray();
        char[] afArr = after.toCharArray();
        
        Arrays.sort(beArr);
        Arrays.sort(afArr);
        
        String sortBe = new String(beArr);
        String sortAf = new String(afArr);
        
        if(sortBe.equals(sortAf)){
            return 1;
        }else{
            return 0;
        }
        
    }
}