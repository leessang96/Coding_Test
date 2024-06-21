import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	for(int i=0; i<arr.length; i++) {
		arr[i] += sc.nextInt(); 
	}
		
	int v = sc.nextInt();
	
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i] == v) {
			sum++;
		}
	}
		
	System.out.println(sum);
	
	
	}

}
