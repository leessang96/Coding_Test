import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] w = new String[5];
        
        int max = 0;
        for(int i=0; i<w.length; i++){
            w[i] = sc.nextLine();
            if(w[i].length() > max){
                max = w[i].length();
            }
        }
        
        String str = "";
        for(int col=0; col<max; col++){
            for(int row=0; row<5; row++){
                if(col < w[row].length()){
                    str += w[row].charAt(col);
                }
            }
        }
        
        System.out.println(str);
        sc.close();
        
    }
}