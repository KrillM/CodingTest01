package Bronze5;

import java.util.Scanner;

public class Q20_3003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]black={1,1,2,2,2,8};
        int[]white=new int[black.length];

        for(int i=0;i<white.length;i++) white[i]=sc.nextInt();
        for(int i=0;i<white.length;i++) System.out.print(black[i]-white[i]+" ");
    }
}
