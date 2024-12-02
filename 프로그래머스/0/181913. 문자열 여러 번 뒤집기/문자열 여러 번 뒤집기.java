class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            while(s < e){
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                
                s++;
                e--;
                
            }
        }
        answer = new String(arr);
        return answer;
    }
}