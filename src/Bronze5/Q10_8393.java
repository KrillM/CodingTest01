package Bronze5;

import java.util.Scanner;

public class Q10_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int hap = 0;
        for(int i=1;i<=x;i++) hap+=i;
        System.out.println(hap);
    }
}
