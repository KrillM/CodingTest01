package day06;

import java.util.Scanner;

public class Q04_17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%8==1) System.out.println(1);
        else if(x%8==0 || x%8==2) System.out.println(2);
        else if(x%8==7 || x%8==3) System.out.println(3);
        else if(x%8==6 || x%8==4) System.out.println(4);
        else System.out.println(5);
    }
}
