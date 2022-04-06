package challenge.easy;
/*Project Teams
There are N students in a class and Teacher want
to divide these students into some groups . Teacher
told that groups consisting of two or less students
not allowed , so Teacher want to have as many groups
consisting of three or more students as possible.

Divide the students so that the number of groups consisting
of three or more students is maximized.*/

import java.util.Scanner;

public class ProjectTeams {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();

        System.out.println(student / 3);
    }
}
