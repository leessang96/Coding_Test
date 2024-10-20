import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.nextLine();

    	for(char ch='a'; ch<='z'; ch++) {
    		int p = s.indexOf(ch);
    		System.out.print(p + " ");
    	}
    	
    	
    	
    }

}