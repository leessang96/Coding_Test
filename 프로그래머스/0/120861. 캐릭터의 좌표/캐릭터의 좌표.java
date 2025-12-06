class Solution{
    public int[] solution(String[] keyinput, int[] board){
        int[] pos = {0,0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for(String key : keyinput){
            if(key.equals("left")){
                if(pos[0] - 1 >= -maxX) pos[0] -= 1;
            }else if(key.equals("right")){
                if(pos[0] + 1 <= maxX) pos[0] += 1;
            }else if(key.equals("up")){
                if(pos[1] + 1 <= maxY) pos[1] += 1;
            }else if(key.equals("down")){
                if(pos[1] - 1 >= -maxY) pos[1] -= 1;
            }
        }
        
        return pos;
        
    }
}