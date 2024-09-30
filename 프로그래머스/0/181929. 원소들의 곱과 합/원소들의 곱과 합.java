class Solution {
    public int solution(int[] num_list) {

        int n = 1;
        int m = 0;
        
        for(int i=0; i<num_list.length; i++){
            n *= num_list[i];
            m += num_list[i];
        }
        
        if(n < m * m){
            return 1;
        }else{
            return 0;
        }
        
    }
}