package day03;

import java.util.Scanner;

public class Q03_2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++) if(i+j<x) System.out.print("*");
            System.out.println();
        }
    }
}
