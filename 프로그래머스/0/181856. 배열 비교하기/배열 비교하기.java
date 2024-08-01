class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int sum = 0;
        int sum2 = 0;
        
        for(int i : arr1){
            sum += i;
        }
        
        for(int j : arr2){
            sum2 += j;
        }
        
        if(arr1.length > arr2.length){
            answer = 1;
        }else if(arr1.length < arr2.length){
            answer = -1;
        }else{
            for(int k=0; k<arr1.length; k++){
                if(sum > sum2){
                    answer = 1;
                }else if(sum < sum2){
                    answer = -1;
                }else{
                    answer = 0;
                }
            }
        }
        return answer;
    }
}