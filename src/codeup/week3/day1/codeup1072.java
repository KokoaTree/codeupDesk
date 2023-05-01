package codeup.week3.day1;

import java.util.Scanner;

public class codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nVal = 0;

        for(int i = 0; i < num; i++) {
            nVal = sc.nextInt();
            System.out.printf("%d\n", nVal);
        }
    }
}
