import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.toUpperCase();
        int[] count = new int[26]; // 문자열 b의 알파벳 개수를 저장하기 위한 배열

        for (int i=0; i < a.length(); i++){
            count[b.charAt(i) - 'A']++;
        }

        int max = 0; // 최대값
        for (int i=0; i < count.length; i++){
            if (max < count[i]){
                max = count[i];
            }
        }

        // 최대값의 개수를 담는 변수를 만들어서 1보다 크거나 아닐 경우를 구하면?
        int cnt = 0;
        for (int i=0; i < count.length; i++){
            if(count[i] == max){
                cnt++;
            }
        }

        if(cnt > 1){
            System.out.println('?');
        }else{
            for(int i=0; i < count.length; i++){
                if(count[i] == max){
                    System.out.println((char)(i + 'A'));
                }
            }
        }

    }
}