package day03;

import java.util.Scanner;

public class Q04_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int[][]item=new int[num][2];
        int com = 0;

        for(int i=0;i<item.length;i++){
            item[i][0]=sc.nextInt();
            item[i][1]=sc.nextInt();
            com += item[i][0]*item[i][1];
        }

        if(total==com) System.out.println("Yes");
        else System.out.println("No");
    }
}
