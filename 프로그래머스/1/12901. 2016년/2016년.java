import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        Calendar c = Calendar.getInstance();
        c.set(2016, a-1, b);
        int days = c.get(Calendar.DAY_OF_WEEK);
        
        switch(days){
            case 1 : answer = "SUN";
                break;
            case 2 : answer = "MON";
                break;
            case 3 : answer = "TUE";
                break;
            case 4 : answer = "WED";
                break;
            case 5 : answer = "THU";
                break;
            case 6 : answer = "FRI";
                break;
            case 7 : answer = "SAT";
                break;
        }
        
        return answer;
    }
}