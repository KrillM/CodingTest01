package bronze5_2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][]add = new int[x][2];
        int[]show = new int[add.length];

        for(int i=0;i<add.length;i++){
            add[i][0] = sc.nextInt();
            add[i][1] = sc.nextInt();
            show[i]=add[i][0]+add[i][1];
            System.out.println("Case #"+(i+1)+": "+add[i][0]+ " + "+add[i][1]+" = "+show[i]);
        }
    }
}
