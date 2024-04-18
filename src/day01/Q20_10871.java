package day01;

import java.util.Scanner;

public class Q20_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int []y = new int[x];

        for(int i=0;i<y.length;i++){
            y[i]=sc.nextInt();
        }

        for(int i=0;i<y.length;i++){
            if(y[i]<n) System.out.print(y[i]+" ");
        }
    }
}

