package challenge.easy;
/*SwapMaster solves Symmetric Swap
The SwapMaster is known to be the greatest and fastest swapper
of all time. You intend to bring him down and become the new
SwapMaster of the city. Through some secret sources, you found
out that The SwapMaster undertook yet another task from Dr.
Symmetry. The task he undertook is to perform a Symmetric Swap
on an array A of numbers. Perform this task before SwapMaster
to become the new SwapMaster.
A Symmetric Swap involves swapping a number in an array with
its symmetric position in the array.
For example, if you want to swap element at position 2, you
will swap it with the 2nd element from the back of the array.*/

import java.util.Scanner;

public class SwapMasterSolvesSymmetricSwap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int t = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = t;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
