class Solution {
    public String solution(int age) {
        String answer = "";
        String age1 = "abcdefghij";
        String[] arr = String.valueOf(age).split("");
        
        for(int i=0; i<arr.length; i++){
            answer += age1.charAt(Integer.parseInt(arr[i]));
        }
        return answer;
    }
}