package day05;

import java.util.Scanner;

public class Q01_11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]apple = new int[2];
        int[]orange = new int[2];

        for(int i=0;i<apple.length;i++) apple[i]=sc.nextInt();
        for(int i=0;i<orange.length;i++) orange[i]=sc.nextInt();

        if(apple[0]+orange[1]>apple[1]+orange[0]) System.out.println(apple[1]+orange[0]);
        else if(apple[0]+orange[1]<apple[1]+orange[0]) System.out.println(apple[0]+orange[1]);
        else System.out.println(apple[0]+orange[1]);
    }
}
