import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] f = {1,2,3,4,5};
        int[] s = {2,1,2,3,2,4,2,5};
        int[] t = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == f[i % 5]){
                score[0]++;
            }
            if(answers[i] == s[i % 8]){
                score[1]++;
            }
            if(answers[i] == t[i % 10]){
                score[2]++;
            }
        }
        
        int max = 0;
        for(int i=0; i<score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++){
            if(max == score[i]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}