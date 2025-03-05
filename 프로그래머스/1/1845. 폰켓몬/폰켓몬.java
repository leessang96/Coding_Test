import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pNum = nums.length / 2;
        
        // 중복 제거용 set
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }
        
        // 가져갈 수 있는 포켓몬 수 비교
        if(pNum >= set.size()){
            answer = set.size();
        }else{
            answer = pNum;
        }
        
        return answer;
    }
}