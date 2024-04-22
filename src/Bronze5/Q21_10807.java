package Bronze5;

import java.util.Scanner;

public class Q21_10807 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int[]input=new int[x];
        int conut = 0;

        for(int i=0;i<input.length;i++) input[i]= sc.nextInt();
        int y = sc.nextInt();

        for(int i=0;i<input.length;i++) if(input[i]==y) conut++;
        System.out.println(conut);
    }
}
