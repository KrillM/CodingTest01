package day04_wn;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[3];
        for(int i=0;i<x.length;i++) x[i]=sc.nextInt();
        Arrays.sort(x);

        System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}
