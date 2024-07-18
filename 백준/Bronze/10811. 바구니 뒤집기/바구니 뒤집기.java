import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int arr[] = new int[n+1];
    	
    	for(int i=1; i<=n; i++) {
    		arr[i] = i;
    	}
    	
    	for(int i=0; i<m; i++) {
    		int I = sc.nextInt();
    		int J = sc.nextInt();
    		
    		for(int j=I; j<=J; j++) {
    			
    			int k = J--;
    			int temp = arr[j];
    			arr[j] = arr[k];
    			arr[k] = temp;
    		}
    	}
    	
    	for(int i=1; i<=n; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	
    
    }
}