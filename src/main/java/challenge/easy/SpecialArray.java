package challenge.easy;
/*Special Array
Natural numbers are the set of positive integers, which
ranges from 1 to infinity excluding fractional part.
Natural numbers are whole numbers excluding zero. Zero
is the only whole number which is not a natural number.
An array is special if all the elements are natural numbers.
Find whether the given array is special or not.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();sc.nextLine();
        String[] natural = sc.nextLine().split(" ");
        ArrayList<String> naturalList = new ArrayList<>(List.of(natural));

        if(naturalList.indexOf("0") == -1)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
