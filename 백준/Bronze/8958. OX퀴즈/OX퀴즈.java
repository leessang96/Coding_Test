//  OX퀴즈

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int test=0; test<t;test++){
            String ox = sc.nextLine();

            int sum = 0;
            int num = 0;

            for(int i=0; i<ox.length(); i++){
                if(ox.charAt(i)=='O'){
                    num++;
                    sum += num;
                }else{
                    num = 0;
                }
            }

            System.out.println(sum);

        }



    }
}