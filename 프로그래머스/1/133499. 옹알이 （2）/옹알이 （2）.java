class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling){
            String cur = b;
            String prev = ""; // 직전에 사용한 발음
            
            boolean ok = true; // 현재 문자열이 조건을 만족하는지 여부
            
            while(!cur.isEmpty()){ // 문자열이 빌때까지
                boolean matched = false; // 유효한 발음을 찾았는지에 대한 스위치
                
                for(String w : word){
                    if(cur.startsWith(w) && !prev.equals(w)){ // 문자열이 w로 시작하고, 중복되지 않은지 확인
                        prev = w;
                        cur = cur.substring(w.length());
                        matched = true;
                        break;
                    }
                }
                
                if(!matched){
                    ok = false;
                    break;
                }
                
            }
            if(ok) answer++;            
        }
        
        return answer;
    }
}