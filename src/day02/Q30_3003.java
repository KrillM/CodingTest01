package day02;

import java.util.Scanner;

public class Q30_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]black = {1, 1, 2, 2, 2, 8};
        int[]white = new int[black.length];
        int[]x = new int[white.length];

        for(int i = 0; i<white.length; i++){
            white[i] = sc.nextInt();
            x[i] = black[i] - white[i];
        }

        for (int i=0; i<x.length;i++){
            System.out.print(x[i]);
        }
    }
}
