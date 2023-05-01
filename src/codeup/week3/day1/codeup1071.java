package codeup.week3.day1;

import java.util.Scanner;

public class codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 0; iVal != 0; i++) {
            System.out.println(iVal);
            iVal = sc.nextInt();
            if(iVal == 0) {
                break;
            }
        }
    }
}
