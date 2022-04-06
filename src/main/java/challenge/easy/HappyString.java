package challenge.easy;
/*Happy String
A happy string is a string in which each character is
lexicographically greater than its next character. You
are given a positive integer N as an input. You need to
print the smallest lexicographical string possible of length N.
NOTE: All characters in a happy string are in lowercase.*/

import java.util.Scanner;

public class HappyString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = number; i > 0; i--) {
            char nextChar = (char) (96 + i);
            System.out.print(nextChar);
        }
    }
}
