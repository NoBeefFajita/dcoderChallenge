package challenge.easy;
/*Three's Company
This problem requires you to create a output string from
input string such that for every character in input string,
there are three same characters in output string.
*/

import java.util.Scanner;

public class ThreeCompany {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int letterLength = sc.nextInt();
        String letter = sc.next();
        String[] spelling = null;
        sc.close();

        spelling = letter.split("");

        for (String a : spelling) {
            for (int i = 0; i < 3; i++) {
                System.out.print(a);
            }
        }
    }
}
