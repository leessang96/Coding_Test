import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int w = arr[0].length;
        int h = arr.length;
        
        if(w < h){
            answer = new int[h][h];
            for(int i=0; i<h; i++){
                Arrays.fill(answer[i], 0);
                for(int j=0; j<w; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        }else if(w > h){
            answer = new int[w][w];
            
            for(int i=0; i<w; i++){
                for(int j=0; j<w; j++){
                    if(i < h){
                        answer[i][j] = arr[i][j];
                    }else{
                        answer[i][j] = 0;
                    }
                }
            }
        }else{
            answer = arr.clone();
        }
        
        return answer;
    }
}