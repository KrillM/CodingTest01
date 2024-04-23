package day04;

import java.util.Scanner;

public class Q07_10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x*y-z<=0) System.out.println(0);
        else System.out.println(x*y-z);
    }
}
