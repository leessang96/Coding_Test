import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int target = 1;
        
        while(target < arr.length){
            target *= 2;
        }
        answer = new int[target];
        Arrays.fill(answer, 0);
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        
        return answer;
    }
}