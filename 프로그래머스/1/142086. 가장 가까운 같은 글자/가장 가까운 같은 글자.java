import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Arrays.fill(answer, -1);
        char[] ch = s.toCharArray();
        
        for(int i=1; i<ch.length; i++){
            for(int j=0; j<i; j++){
                if(ch[i] == ch[j]){
                    answer[i] = i - j;
                }
            }
        }
        return answer;
    }
}