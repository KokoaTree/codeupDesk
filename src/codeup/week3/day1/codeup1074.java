package codeup.week3.day1;

import java.util.Scanner;

public class codeup1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int num = sc.nextInt(); num <= 100; num--){
            System.out.println(num);
            if(num == 1) {
                break;
            }
        }
    }
}
