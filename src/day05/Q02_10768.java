package day05;

import java.util.Scanner;

public class Q02_10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(month==1 || (month==2 && day<18)) System.out.println("Before");
        else if(month==2 && day==18) System.out.println("Special");
        else System.out.println("After");
    }
}
