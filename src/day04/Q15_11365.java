package day04;

import java.util.Scanner;

public class Q15_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String x = sc.nextLine();
            if(x.equals("END")) break;
            for(int i=x.length()-1;i>=0;i--) System.out.print(x.charAt(i));
            System.out.println();
        }
    }
}
