package Bronze5;

import java.util.Scanner;

public class Q26_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String []word = new String[x];

        for(int i=0;i<word.length;i++) word[i]= sc.next();
        for(int i=0;i<word.length;i++) {
            char a = word[i].charAt(0) ;
            char b = word[i].charAt(word[i].length()-1);
            System.out.print(a);
            System.out.println(b);
        }
    }
}
