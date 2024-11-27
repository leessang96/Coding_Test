import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
            
        ArrayList<Integer> stk = new ArrayList<Integer>();
        int i = 0;
        while(i < arr.length){
            
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            }else {
                stk.add(arr[i]);
                i++;
            }
        }
                
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        
        answer = new int[stk.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = stk.get(j);
        }
        
        
        return answer;
    }
}