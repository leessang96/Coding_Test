import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        Set<Integer> intSet = new HashSet<>();
        
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(!intSet.contains(arr[i])){
                answer[idx++] = arr[i];
                intSet.add(arr[i]);
            }
            
            if(idx >= k){
                break;
            }
        }
        return answer;
    }
}