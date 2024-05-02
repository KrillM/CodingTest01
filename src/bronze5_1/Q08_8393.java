package bronze5_1;

import java.util.Scanner;

public class Q08_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int total = 0;
        for(int i=1;i<=x; i++) total+=i;
        System.out.println(total);
    }
}
