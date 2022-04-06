package challenge.easy;
/*String Matching
Cody has a sequence of characters N. He likes a sequence
if it contains his favourite sequence as a substring.
Given the sequence and his favourite sequence F, check
whether the favourite sequence is present in the sequence.*/

import java.util.Scanner;

public class StringMatching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        Outer:
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            String f = sc.next();

            for (int j = 0; j < (n.length() - f.length()); j++) {
                if (n.substring(j, j + f.length()).equals(f)) {
                    System.out.println("Yes");
                    continue Outer;
                }
            }
            System.out.println("No");
        }
    }
}
