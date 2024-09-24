class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        
        for(int i=1; i<=num_list.length; i++){
            if(num_list[i-1] % 2 == 1){
                a += num_list[i-1] + "";
            }else{
                b += num_list[i-1] + "";
            }
        }
        
        answer = Integer.parseInt(a) + Integer.parseInt(b);
        
        return answer;
    }
}