package Bronze5;

import java.util.Scanner;

public class Q14_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[]input = new int[x];
        int y = sc.nextInt();

        for(int i=0;i<input.length;i++) input[i]=sc.nextInt();

        for(int i=0;i<input.length;i++){
            if(input[i]<y) System.out.print(input[i]+" ");
        }
    }
}
