import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        return list;
    }
}