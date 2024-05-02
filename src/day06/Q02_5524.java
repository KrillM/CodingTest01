package day06;

import java.util.Scanner;

public class Q02_5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            String name = sc.next();
            System.out.println(name.toLowerCase());
        }
    }
}
