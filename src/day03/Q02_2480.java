package day03;

import java.util.Scanner;

public class Q02_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[3];
        int max = 0;
        int same = 0;

        for(int i=0;i<x.length;i++) {
            x[i] = sc.nextInt();
            max = x[i];
            for(int j=0;j<i;j++) {
                if(max < x[j]) max = x[j];
                if(x[j]==x[i]) same = x[j];
            }
        }

        if(x[0]==x[1] && x[1]==x[2] && x[0]==x[2]) System.out.println(10000+max*1000);
        else if((x[0]==x[1]&&x[0]!=x[2]) || (x[0]==x[2]&&x[0]!=x[1]) || (x[1]==x[2]&&x[1]!=x[0])) System.out.println(1000+same*100);
        else System.out.println(100*max);
    }
}