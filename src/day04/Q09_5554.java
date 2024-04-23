package day04;

import java.util.Scanner;

public class Q09_5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[4];
        int total = 0;
        for(int i=0;i<x.length;i++){
            x[i]= sc.nextInt();
            total+=x[i];
        }

        int sec = total%60;
        int min = total/60;

        System.out.println(min);
        System.out.println(sec);
    }
}
