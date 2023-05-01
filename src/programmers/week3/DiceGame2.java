package programmers.week3;

import java.util.Scanner;

import static java.lang.Math.pow;

public class DiceGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();
        double result = iVal1 + iVal2 + iVal3;
//        숫자 제곱
        double powVal1 = pow(iVal1, 2);
        double powVal2 = pow(iVal2, 2);
        double powVal3 = pow(iVal3, 2);
        double result2 = powVal1 + powVal2 + powVal3;
//        숫자 세제곱
        double pow3Val1 = pow(iVal1, 3);
        double pow3Val2 = pow(iVal2, 3);
        double pow3Val3 = pow(iVal3, 3);
        double result3 = pow3Val1 + pow3Val2 + pow3Val3;

        if(!(iVal1 == iVal2 && iVal2 == iVal3)) {
            result = iVal1 + iVal2 + iVal3;
            System.out.println(result);
        } else if (iVal1 != iVal2 || iVal1 != iVal3) {
            result = result * result2;
            System.out.println(result);
        } else if (iVal1 == iVal2 && iVal2 == iVal3) {
            result = result * result2 * result3;
            System.out.println(result);
        }
    }
}
