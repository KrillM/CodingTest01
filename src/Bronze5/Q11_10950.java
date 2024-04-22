package Bronze5;

import java.util.Scanner;

public class Q11_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[][]x=new int[input][2];
        int[]y=new int[x.length];

        for(int i=0;i<y.length;i++){
            x[i][0]= sc.nextInt();
            x[i][1]= sc.nextInt();
            y[i] = x[i][0]+x[i][1];
        }

        for (int i=0;i<y.length;i++) System.out.println("Case #"+(i+1)+": "+x[i][0]+" + " +x[i][1]+" = " +y[i]);
    }
}
