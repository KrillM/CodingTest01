package day04;

import java.util.Scanner;

public class Q11_5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []mk = new int[4];
        int []ms =new int[4];
        int mkTotal = 0;
        int msTotal = 0;

        for(int i=0;i<mk.length;i++) {
            mk[i]=sc.nextInt();
            mkTotal+=mk[i];
        }

        for(int i=0;i<ms.length;i++) {
            ms[i]=sc.nextInt();
            msTotal+=ms[i];
        }

        if(mkTotal>msTotal) System.out.println(mkTotal);
        else if(mkTotal<msTotal) System.out.println(msTotal);
        else System.out.println(mkTotal);
    }
}
