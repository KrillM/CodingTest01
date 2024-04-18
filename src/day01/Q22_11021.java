package day01;

import java.util.Scanner;

public class Q22_11021 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int[][]y = new int[x][2];
        int[]z = new int[y.length];

        for(int i=0;i<y.length;i++){
            y[i][0] = sc.nextInt();
            y[i][1] = sc.nextInt();
            z[i]=y[i][0]+y[i][1];
        }

        for(int i=0;i<z.length;i++){
            System.out.println("Case #"+(i+1)+": " +y[i][0]+" + "+y[i][1]+" = " + z[i]);
        }
    }
}
