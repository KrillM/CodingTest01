package Bronze5_wn;

import java.util.Scanner;

public class Q42_5597 {
    public static void main(String[] args) {
        int[]x=new int[31];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<28;i++){
            int num = sc.nextInt();
            x[num]++;
        }

        for(int i=1;i<=30;i++){
            if(x[i]==0) System.out.println(i);
        }
    }
}
