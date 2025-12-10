import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        String c = "";
        
        for(char d : b){
            if(Character.isUpperCase(d)) c += Character.toLowerCase(d);
            else c += Character.toUpperCase(d);
        }
        
        System.out.println(c);
        
    }
}