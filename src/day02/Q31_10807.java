package day02;

import java.util.Scanner;

public class Q31_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[]y = new int[x];

        for(int i=0;i<x;i++){
            y[i]=sc.nextInt();
        }
        int z = sc.nextInt();
        int cnt =0;

        for(int i=0;i<x;i++){
            if(y[i]==z) cnt++;
        }
        System.out.println(cnt);

    }
}
