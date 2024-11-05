class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int ar = 0;
        int[] arr = new int[included.length];
        
        for(int i=0; i<included.length; i++){
            if(i == 0){
                ar = a;
                arr[i] = a;
            }else{
                ar += d;
                arr[i] = ar;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(included[i] == true){
                answer += arr[i];
            }
        }
        return answer;
    }
}