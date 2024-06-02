import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		h += c / 60;
		m += c % 60;
		
		if(m >= 60) {
			h += 1;
			m -= 60; 
		}
		
		if(h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
		
		
	}

}
