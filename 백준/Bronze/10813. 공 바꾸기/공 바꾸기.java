import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] basket = new int[n];
        int m = sc.nextInt();
        int temp;
        
        for(int i=0; i<basket.length; i++) {
        	basket[i] = i+1;
        }
        
        for(int j=0; j<m; j++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	temp = basket[a-1];
        	basket[a-1] = basket[b-1];
        	basket[b-1] = temp;
        }
        for(int i=0; i<basket.length; i++) {
        	System.out.print(basket[i] + " ");
        }
        
        
        
    }
}