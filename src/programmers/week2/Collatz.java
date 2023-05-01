package programmers.week2;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int answer = 0;
        int num = sc.nextInt();
        int cnt = 0;

        while(true){
            if (num % 2 == 0) {
                num /= 2;
                cnt++;
                if (num % 2 == 0) {
                    num /= 2;
                    cnt++;
                } else {
                    num = num *3 + 1;
                    cnt++;
                }
                if (num == 1) {
                    System.out.printf("%d\n", cnt);
                    break;
                }
            }
//            else {
//                num = num * 3 + 1;
//                cnt++;
//                if (num % 2 == 0) {
//                    num /= 2;
//                    cnt++;
//                }
//                if (num == 1) {
//                    System.out.printf("%d\n", cnt);
//                    break;
//                }
//            }
        }
    }
}
