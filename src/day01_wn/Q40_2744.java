package day01_wn;

import java.util.Scanner;

public class Q40_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String dap = "";

        for(int i=0;i<x.length();i++){
            if(Character.isUpperCase(x.charAt(i))) dap+=Character.toLowerCase(x.charAt(i));
            else dap+=Character.toUpperCase(x.charAt(i));
        }

        System.out.println(dap);
    }
}
