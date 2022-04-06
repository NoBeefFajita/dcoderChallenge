package challenge.easy;
/*Circle of Numbers
All numbers in NumberLand are standing in a circle for a
dancing ceremony. Every number needs a dancing partner.
Dancing partner of any number is the number which is standing
radially opposite to it in the circle. The numbers are from 0
to N-1. A certain number X wants to know who will be its dancing
partner. Please help X.
*/

import java.util.Scanner;

public class CircleOfNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (x < n / 2) {
            System.out.println(x + n / 2);
        } else {
            System.out.println(x - n / 2);
        }
    }
}
