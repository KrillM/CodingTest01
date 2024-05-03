package bronze5_3;

import java.util.Scanner;

public class Q08_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = new int[5];
        int total = 0;
        for(int i=0;i<x.length;i++) {
            x[i] = sc.nextInt();
            total += x[i]*x[i];
        }
        System.out.println(total%10);
    }
}
