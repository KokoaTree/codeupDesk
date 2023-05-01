package codeup.week3.day1;

import java.util.Scanner;

public class codeup1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for(int i = iVal; i <= 100; i--) {
            iVal -= 1;
            System.out.println(iVal);
            if(iVal == 0) {
                break;
            }
        }

    }
}
