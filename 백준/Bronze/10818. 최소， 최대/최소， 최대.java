import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
			
			if(min > a[i]) {
				min = a[i];
			}
			
		}
		
		System.out.println(min + " " + max);
		
		
	}

}
