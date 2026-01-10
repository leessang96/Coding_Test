import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(int i=0; i<list.length; i++){
            if(str.contains(list[i])){
                str = str.replace(list[i], ".");
            }
        }
        
        System.out.println(str.length());
        
        sc.close();
    }
}