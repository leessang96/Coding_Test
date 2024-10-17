import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    list.add(arr[i]);
                }
            }
        }
        
        answer = new int[arr.length - list.size()];
        int idx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                answer[idx++] = arr[i];
            }    
        }
        return answer;
    }
}