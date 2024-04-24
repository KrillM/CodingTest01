package day05;

import java.util.Scanner;

public class Q06_17388 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min = 0;
        int[]x=new int[3];
        for(int i=0;i<x.length;i++) {
            x[i]=sc.nextInt();
            min=x[i];
            for(int j=0;j<i;j++) if(x[j]<min) min = x[j];
        }

        if(x[0]+x[1]+x[2]>=100) System.out.println("OK");
        else if(min==x[0]) System.out.println("Soongsil");
        else if(min==x[1]) System.out.println("Korea");
        else System.out.println("Hanyang");
    }
}
