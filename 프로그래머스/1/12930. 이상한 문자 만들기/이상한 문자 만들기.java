class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        int idx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                idx = 0;
            }else{
                idx++;
            }
            
            if(idx % 2 == 0){
                answer += arr[i].toLowerCase();
            }else{
                answer += arr[i].toUpperCase();
            }
        }
        
        return answer;
    }
}