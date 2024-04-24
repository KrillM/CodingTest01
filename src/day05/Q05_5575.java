package day05;

import java.util.Scanner;

public class Q05_5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]ch=new int[3];
        int[]cm=new int[3];
        int[]cs=new int[3];
        int[]th=new int[3];
        int[]tm=new int[3];
        int[]ts=new int[3];

        for(int i=0;i<3;i++){
            ch[i] = sc.nextInt();
            cm[i] = sc.nextInt();
            cs[i] = sc.nextInt();

            th[i] = sc.nextInt();
            tm[i] = sc.nextInt();
            ts[i] = sc.nextInt();

            ts[i]-=cs[i];
            tm[i]-=cm[i];
            th[i]-=ch[i];

            if(ts[i]<0){
                tm[i]-=1;
                ts[i]=60+ts[i];
            }
            if(tm[i]<0){
                th[i]-=1;
                tm[i]=60+tm[i];
            }
        }

        for(int i=0;i<3;i++) System.out.println(th[i]+" "+tm[i]+" "+ts[i]);
    }
}
