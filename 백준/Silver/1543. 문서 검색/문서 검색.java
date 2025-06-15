import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int answer = 0;
        int s = 0;
        while(true){
            int findIndex = doc.indexOf(word, s);
            if(findIndex < 0){
                break;
            }
            answer++;
            s = findIndex + word.length();
        }

        System.out.println(answer);


    }
}
