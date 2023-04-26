package codeup.week2.day3;

import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double avg = (num1 + num2 + num3) / 3.0;

        System.out.printf("%d\n", sum);
        System.out.printf("%.1f", avg);
    }
}
