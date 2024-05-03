package bronze5_3;

import java.util.Scanner;

public class Q04_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] white = {1,1,2,2,2,8};
        int [] x = new int[white.length];
        int [] show = new int[x.length];

        for(int i=0;i<x.length;i++){
            x[i] = sc.nextInt();
            show[i] = white[i]-x[i];
            System.out.print(show[i]+" ");
        }
    }
}
