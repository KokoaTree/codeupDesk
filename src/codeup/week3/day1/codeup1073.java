package codeup.week3.day1;

import java.util.Scanner;

public class codeup1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nVal;
        for(int i = 1; i != 0; i++) {
            nVal = sc.nextInt();
            if (nVal == 0) {
                break;
            }
            System.out.printf("%d\n", nVal);

        }
    }
}
