package day04;

import java.util.Scanner;

public class Q02_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[]alphabetNum = new int[26];
        int[]result = new int[alphabetNum.length];

        for(int i=0;i<alphabetNum.length;i++) alphabetNum[i]=i+97;
        for(int i=0;i<word.length();i++) for(int j=0;j<alphabetNum.length;j++) if((int)word.charAt(i)==alphabetNum[j]) result[j]++;
        for(int i=0;i<result.length;i++) System.out.print(result[i]+" ");
    }
}
