import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
         HashMap<String, Integer> runner = new HashMap<String, Integer>();
        HashMap<String, Integer> finisher = new HashMap<String, Integer>();

        for(int i = 0; i < participant.length; i++){
            runner.put(participant[i],runner.getOrDefault(participant[i],0)+1);
            if(i < participant.length - 1)
                finisher.put(completion[i],finisher.getOrDefault(completion[i],0)+1);
        }

        for(int i = 0; i < participant.length; i++){

            if(i == participant.length - 1)
                 return participant[i];

            if(finisher.get(participant[i]) == null)
                 return participant[i];

            if((int)runner.get(participant[i]) == (int)finisher.get(participant[i])){
                continue;
            }else{
                return participant[i];
            }

        }
        return "";
    }
}