import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        ArrayList<String> strList = new ArrayList<String>();
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].isEmpty()){
                strList.add(strArr[i]);
            }
        }
        
        String[] arr = strList.toArray(new String[strList.size()]);
        Arrays.sort(arr);
        
        return arr;
    }
}