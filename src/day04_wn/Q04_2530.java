package day04_wn;

import java.util.Scanner;

public class Q04_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int c = sc.nextInt();

        s+=c;
        if(s>59){
            s%=60;

        }

        System.out.println(h+" "+m+" "+s);
    }
}
