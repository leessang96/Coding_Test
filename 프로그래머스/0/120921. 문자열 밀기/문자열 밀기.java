class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = "";
        char[] c = A.toCharArray();
        int i = 0;

        if(A.equals(B)) return answer;

        while(i < c.length){

            for(int j=c.length - 1 - i; j<c.length; j++){
                str += c[j];
            }
            for(int k=0; k<c.length - 1 - i; k++){
                str += c[k];
            }
            
            answer++;

            if(str.equals(B)){
                break;
            }else{
                i++;
                str = "";
                continue;
            }
        }
        
        if(!str.equals(B)){
            answer = -1;
        }


        return answer;
    }
}