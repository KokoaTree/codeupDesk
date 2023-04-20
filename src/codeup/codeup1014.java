package codeup;

import java.util.Scanner;

public class codeup1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character word1 = scan.next().charAt(0);
        Character word2 = scan.next().charAt(0);

        System.out.printf("%s %s", word2, word1);
    }
}
