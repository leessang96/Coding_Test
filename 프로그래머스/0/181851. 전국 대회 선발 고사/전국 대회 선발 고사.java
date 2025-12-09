import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer, a, b, c = 0;
        int[] idx = new int[3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<attendance.length; i++){
            if(attendance[i] == true) list.add(rank[i]);
        }
        
        Collections.sort(list);
        
        for(int i=0; i<3; i++){
            for(int j=0; j<rank.length; j++){
                if(list.get(i) == rank[j]) idx[i] = j;
            }
        }
        
        a = idx[0] * 10000;
        b = idx[1] * 100;
        c = idx[2];
        
        answer = a + b + c;
        
        
        return answer;
    }
}