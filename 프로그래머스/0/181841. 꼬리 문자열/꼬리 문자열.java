class Solution {
    public String solution(String[] list, String ex) {
        String answer = "";
        
        for(int i=0; i<list.length; i++){
            if(!list[i].contains(ex)){
                answer += list[i];
            }
        }
        return answer;
    }
}