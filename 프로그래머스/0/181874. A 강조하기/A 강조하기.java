class Solution {
    public String solution(String myString) {
        
        return myString.replace(myString, myString.toLowerCase()).replace("a", "A");
    }
}