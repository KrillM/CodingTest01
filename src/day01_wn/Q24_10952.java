package day01_wn;

import java.util.Scanner;

public class Q24_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x==0 && y==0) break;
            System.out.println(x+y);
        }
    }
}
