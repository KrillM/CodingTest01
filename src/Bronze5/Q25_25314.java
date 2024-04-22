package Bronze5;

import java.util.Scanner;

public class Q25_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "long ";
        int x = sc.nextInt();

        for(int i=0;i<x/4;i++) System.out.print(word);
        System.out.println("int");
    }
}
