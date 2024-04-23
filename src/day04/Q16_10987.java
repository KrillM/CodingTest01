package day04;

import java.util.Scanner;

public class Q16_10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String x = sc.next();

        for(int i=0;i<x.length();i++) if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u') cnt++;
        System.out.println(cnt);
    }
}
