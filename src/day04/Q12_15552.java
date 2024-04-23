package day04;

import java.io.*;
import java.util.StringTokenizer;

public class Q12_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());

        for(int i=0;i<x;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            bw.write(y+z+"\n");
        }
        bw.flush();
        bw.close();
    }
}
