package day04;

import java.util.Scanner;

public class Q10_5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int mm = sc.nextInt();
        int km = sc.nextInt();

        if(m%mm!=0) m=m/mm+1;
        else m/=mm;
        if(k%km!=0) k=k/km+1;
        else k/=km;

        int min = 0;
        if(m>k) min=m;
        else if(m<k) min=k;
        else min=m;

        System.out.println(d-min);
    }
}
