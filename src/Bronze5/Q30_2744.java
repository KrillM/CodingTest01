package Bronze5;

import java.util.Scanner;

public class Q30_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String word = "";

        for(int i=0;i<x.length();i++){
            if(Character.isUpperCase(x.charAt(i))) word+=Character.toLowerCase(x.charAt(i));
            else word+=Character.toUpperCase(x.charAt(i));
        }
        System.out.println(word);
    }
}
