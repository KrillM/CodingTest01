package day04;

import java.util.Scanner;

public class Q06_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[3];
        for(int i=0;i<x.length;i++) x[i]=sc.nextInt();

        if(x[0]+x[1]+x[2]!=180) System.out.println("Error");
        else if(x[0]!=x[1] && x[0]!=x[2] && x[1]!=x[2]) System.out.println("Scalene");
        else if(x[0]==x[1] && x[1]==x[2] && x[0]==x[2]) System.out.println("Equilateral");
        else System.out.println("Isosceles");
    }
}
