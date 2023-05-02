package codeup.week3.day2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < g; j++) {
                String line = "";
                for (int k = 0; k < b; k++) {
                    line += i + " " + j + " " + k + "\n";
                    cnt++;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}
