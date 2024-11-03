import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        String[] mArr = my_string.split("");
        int[] answer = new int[mArr.length];
        
        for(int i=0; i<mArr.length; i++){
            answer[i] = Integer.parseInt(mArr[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}