package day03;

import java.util.Scanner;

public class Q05_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[5];
        int total=0;

        for(int i=0;i<x.length;i++){
            x[i]= sc.nextInt();
            if(x[i]<40) x[i]=40;
            total+=x[i];
        }
        System.out.println(total/ x.length);
    }
}
