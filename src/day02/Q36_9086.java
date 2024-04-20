package day02;

import java.util.Scanner;

public class Q36_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[]y=new String[x];

        for(int i=0;i<y.length;i++){
            y[i]=sc.next();
        }

        for(int i=0;i<y.length;i++){
            System.out.print(y[i].charAt(0));
            System.out.println(y[i].charAt(y[i].length()-1));
        }
    }
}
