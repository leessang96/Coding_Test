class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] s = ("" + n).split("");
        
        int[] arr = new int[s.length];
        for(int i=0; i<s.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length - 1; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        String str = "";
        for(int i=0; i<arr.length; i++){
            str += arr[i];
        }
        
        return Long.parseLong(str);
    }
}