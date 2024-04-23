package day04;

import java.util.Scanner;

public class Q17_13752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[]sign = new int[x];

        for(int i=0;i<x;i++) sign[i]=sc.nextInt();

        for(int i=0;i<sign.length;i++){
            for(int j=0;j<sign[i];j++) System.out.print("=");
            System.out.println();
        }
    }
}
