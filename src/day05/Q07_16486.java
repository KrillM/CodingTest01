package day05;

import java.util.Scanner;

public class Q07_16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.141592;
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.println((double) (d1*2 + 2*d2*pi));
    }
}
