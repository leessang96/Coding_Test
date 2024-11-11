import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String[] sArr = new String[intStrs.length];
        
        for(int i=0; i<intStrs.length; i++){
            sArr[i] = "";
            for(int j=s; j<s+l; j++){
                sArr[i] += intStrs[i].charAt(j);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<sArr.length; i++){
            if(Integer.parseInt(sArr[i]) > k){
                list.add(Integer.parseInt(sArr[i]));
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}