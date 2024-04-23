package day04;

import java.util.Scanner;

public class Q14_14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2= sc.nextInt();
        int chicken = sc.nextInt();

        if(x1+x2>=chicken*2) System.out.println(x1+x2-chicken*2);
        else System.out.println(x1+x2);
    }
}
