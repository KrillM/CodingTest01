package day04;

import java.util.Scanner;

public class Q19_5717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x==0 && y==0) break;
            System.out.println(x+y);
        }
    }
}
