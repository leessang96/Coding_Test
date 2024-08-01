class Solution {
    public int solution(String myString, String pat) {
        String s = "";
        
        for(char c : myString.toCharArray()){
            if(c == 'A') s += 'B';
            else if(c == 'B') s += 'A';
        }
        
        if(s.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}