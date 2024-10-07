class Solution {
    public int solution(int[] list) {
        int a = 0;
        int b = 0;
        
        for(int i=0; i<list.length; i++){
            if(i % 2 == 0){
                a += list[i];
            }else{
                b += list[i];
            }
        }
        
        return Math.max(a,b);
    }
}