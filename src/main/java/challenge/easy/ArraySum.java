package challenge.easy;

/*
* Array Sum
You are given an integer array and you have to find the sum
 of the elements of the array and find the remainder when
 the sum is divided by the largest number of the array.
* */

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();
        int sum = 0;
        int bigger = 0;

        for (int i = 0; i < n; i++) {
            intList.add(sc.nextInt());
            sum += intList.get(i);
        }

        for (int i : intList) {
            bigger = Math.max(i, bigger);
        }
        System.out.println(sum % bigger);
    }
}
