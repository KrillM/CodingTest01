package bronze5_4;

import java.util.Scanner;

public class Q02_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [] word = new String[num];

        for(int i=0;i<num; i++){
            word[i]=sc.next();
            System.out.println(word[i].charAt(0)+""+word[i].charAt(word[i].length()-1));
        }
    }
}
