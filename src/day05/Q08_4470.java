package day05;

import java.util.Scanner;

public class Q08_4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        for(int i=1;i<=x;i++){
            String word = sc.nextLine();
            System.out.println(i+". "+word);
        }
    }
}
