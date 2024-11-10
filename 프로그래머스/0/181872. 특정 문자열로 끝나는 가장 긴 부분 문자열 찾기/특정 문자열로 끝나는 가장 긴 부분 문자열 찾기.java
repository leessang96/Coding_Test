class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int plen = pat.length();
        int mlen = myString.length();
        
        for(int i=mlen -1; i>=0; i--){
            String subStr = myString.substring(0, i+1);
            if(subStr.endsWith(pat)){
                answer = subStr;
                break;
            }
        }
        return answer;
    }
}