package day04;

import java.util.Scanner;

public class Q01_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[3];
        int min1 = 0;

        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
            min1=x[i];
            for(int j=0;j<i;j++) if(x[j]<min1) min1 = x[j];
        }

        int min2 = 0;
        int coke = sc.nextInt();
        int cider = sc.nextInt();
        if(coke>cider) min2=cider;
        else if(coke<cider) min2=coke;
        else min2=coke;

        System.out.println(min1+min2-50);
    }
}
