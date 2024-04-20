package day02;

import java.util.Scanner;

public class Q29_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int answer = 1;

        if(x!=0) for(int i=1;i<=x;i++) answer *= i;
        System.out.println(answer);
    }
}
