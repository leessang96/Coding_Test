class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int x = 0;
        int[] bfArr = new int[arr.length];
        
        while(x != arr.length){
            x = 0;
            bfArr = arr.clone();
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
                
                if(arr[i] == bfArr[i]){
                    x++;
                }
            }
            answer++;
        }
        return answer-1;
    }
}