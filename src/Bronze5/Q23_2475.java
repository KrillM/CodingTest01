package Bronze5;

import java.util.Scanner;

public class Q23_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[5];
        int hap=0;

        for(int i=0;i<x.length;i++) {
            x[i]= sc.nextInt();
            x[i]*=x[i];
            hap+=x[i];
        }
        System.out.println(hap%10);
    }
}