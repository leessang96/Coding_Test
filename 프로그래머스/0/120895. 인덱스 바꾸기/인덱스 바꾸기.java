class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] ept = my_string.toCharArray();
        
        ept[num1] = my_string.charAt(num2);
        ept[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(ept);
        return answer;
    }
}