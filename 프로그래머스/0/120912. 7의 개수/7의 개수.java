class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] strArr = new String[array.length];
        
        for(int i=0; i<array.length; i++){
            strArr[i] = String.valueOf(array[i]);
        }
        
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j<strArr[i].length(); j++){
                if(strArr[i].charAt(j) == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}