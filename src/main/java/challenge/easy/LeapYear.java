package challenge.easy;
/*Leap Year
Steve is playing a quiz game with his brother John.
As Steve just learned the concept of leap year, John
wanted to test his knowledge. For that, John started
to ask Steve whether a year is a leap year or not by
giving him a random year. Steve is little confused and
he asks your help to the quiz.*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            boolean leap;
            int year = sc.nextInt();
            if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 4 == 0 && year % 400 == 0))
                leap = true;
            else
                leap = false;
            System.out.println(leap ? "Yes" : "No");
        }
    }
}
