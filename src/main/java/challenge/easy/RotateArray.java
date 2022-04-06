package challenge.easy;

/*
Rotate Array
You are given an array of N length. You have to rotate the array
rightwards by K rotations, that is, shift each element to the right
by K positions. Print the rotated array.*/

import java.util.Scanner;

public class RotateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] Arr = new int[N];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < K; i++) {
            int tmp = Arr[Arr.length - 1];
            for (int j = Arr.length - 1; j > 0; j--) {
                Arr[j] = Arr[j - 1];
            }
            Arr[0] = tmp;
        }

        for (int i : Arr) {
            System.out.print(i + " ");
        }
    }
}
