package bronze5_2;

import java.util.Scanner;

public class Q03_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[]comp = new int[x];

        for(int i=0;i<comp.length;i++) {
            comp[i] = sc.nextInt();
            if(comp[i] < y) System.out.print(comp[i]+" ");
        }
    }
}
