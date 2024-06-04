import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			add(a, b);
			
		}
		
		sc.close();
		
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}

}
