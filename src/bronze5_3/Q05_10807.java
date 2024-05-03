package bronze5_3;

import java.util.Scanner;

public class Q05_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[]line = new int[x];

        for(int i=0;i<line.length;i++) line[i] = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;

        for(int i=0;i<line.length;i++) if(line[i] == num) count++;
        System.out.println(count);
    }
}
