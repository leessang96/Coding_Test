import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int index = 1;  
        
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i + 1;  
            }
        }

        System.out.println(max);
        System.out.println(index);
        
        sc.close();
    }
}