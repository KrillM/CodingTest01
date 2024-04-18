package day01;

import java.util.Scanner;

public class Q09_9498 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();

        if(x>89) System.out.println("A");
        else if(x>79) System.out.println("B");
        else if(x>69) System.out.println("C");
        else if(x>59) System.out.println("D");
        else System.out.println("F");
    }
}

