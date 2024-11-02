import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        
        int[] count = new int[max + 1];
        
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        
        max = count[0];
        
        for(int i=1; i<count.length; i++){
            if(max < count[i]){
                max = count[i];
                answer = i;
            }else if(max == count[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}