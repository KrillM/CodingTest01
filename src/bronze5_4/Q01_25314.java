package bronze5_4;

import java.util.Scanner;

public class Q01_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x/4;i++) System.out.print("long ");
        System.out.println("int");
    }
}
