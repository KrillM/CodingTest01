package day04;

import java.util.Scanner;

public class Q08_2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]paper = new int[5];
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=0;i<paper.length;i++) paper[i]=sc.nextInt();
        for(int i=0;i< paper.length;i++) System.out.print(paper[i]-x*y+" ");
    }
}
