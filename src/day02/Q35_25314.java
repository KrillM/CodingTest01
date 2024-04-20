package day02;

import java.util.Scanner;

public class Q35_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String gin = "long ";
        String dap = "";

        for(int i=0;i<x/4;i++){
            dap+=gin;
        }
        System.out.println(dap+"int");
    }
}
