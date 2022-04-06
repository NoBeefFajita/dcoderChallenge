package challenge.easy;

/*
Pangrams
A word or a sentence is called a pangram if all the characters
of this language appear in it at least once, either in lowercase
or in uppercase. You are given a string S consisting of lowercase
and uppercase English letters. If the string is a pangram, print
"YES" else print "NO", without the double quotes.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().toLowerCase().split("");

        ArrayList<String> strList = new ArrayList<>(List.of(str));

        for(int i = 0; i < strList.size(); i++) {
            if(strList.indexOf(strList.get(i)) != i)
                strList.remove(i--);
        }

        if(strList.size() == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}