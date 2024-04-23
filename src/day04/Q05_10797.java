package day04;

import java.util.Scanner;

public class Q05_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int x = sc.nextInt();
        int[]car =new int[5];

        for(int i=0;i<car.length;i++) {
            car[i]=sc.nextInt();
            if(car[i]==x) num++;
        }

        System.out.println(num);
    }
}
