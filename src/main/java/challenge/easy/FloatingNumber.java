package challenge.easy;
/*Floating Number
Bob has a floating point number N. He wants to set the
precision for 2 digits after the decimal point for the number.
He is not good at coding, hence looking for your help.*/

import java.util.Scanner;

public class FloatingNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            float N = sc.nextFloat();
            System.out.printf("%.2f\n", N);
        }
    }
}
