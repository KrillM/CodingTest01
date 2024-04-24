package day05;

import java.util.Scanner;

public class Q03_11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x= new int[4];
        int[]y= new int[2];

        int xTotal = 0;
        int yTotal = 0;
        int xMin = 0;
        int yMin = 0;

        for(int i=0;i<x.length;i++) {
            x[i]= sc.nextInt();
            xTotal+=x[i];
            xMin = x[i];
            for(int j=0;j<i;j++){
                if(x[j]<xMin) xMin = x[j];
            }
        }

        for(int i=0;i<y.length;i++) {
            y[i]=sc.nextInt();
            yTotal+=y[i];
            yMin = y[i];
            for(int j=0;j<i;j++){
                if(y[j]<yMin) yMin = y[j];
            }
        }

        System.out.println((xTotal-xMin)+(yTotal-yMin));
    }
}
