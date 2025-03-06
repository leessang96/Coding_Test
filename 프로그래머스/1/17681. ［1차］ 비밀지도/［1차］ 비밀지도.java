class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String str1 = intoBinaryString(arr1[i], n);
            String str2 = intoBinaryString(arr2[i], n);
            String result = "";
            
            for(int j=0; j<n; j++){
                if(str1.charAt(j) == '0' && str2.charAt(j) == '0'){
                    result += " ";
                }else{
                    result += "#";
                }
            }
            answer[i] = result;
        }
        
        return answer;
    }
    
    public String intoBinaryString(int target, int n){
        String str = Integer.toBinaryString(target);
        
        while(str.length() < n){
            str = "0" + str;
        }
        return str;
    }
    
}