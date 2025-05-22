import java.io.IOException;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++) {
            switch(t.charAt(i)) {
            case 'C': break;
            case 'A': break;
            case 'M': break;
            case 'B': break;
            case 'R': break;
            case 'I': break;
            case 'D': break;
            case 'G': break;
            case 'E': break;
            default :
                sb.append(t.charAt(i));
                break;
            }
        }
        System.out.println(sb);    
    }
}