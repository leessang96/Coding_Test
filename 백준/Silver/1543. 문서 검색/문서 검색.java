import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int answer = 0;
        String replaced = doc.replace(word, "");
        int len = doc.length() - replaced.length();
        answer = len / word.length();

        System.out.println(answer);


    }
}
