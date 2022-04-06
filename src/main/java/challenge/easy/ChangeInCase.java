package challenge.easy;
/*You will be given a single string and two positive integers
denoting indices. You need to change the case of the characters
at those indices,i.e change uppercase to lowercase and lowercase
to uppercase. It is guaranteed that all characters in the string
are alphabets.*/

import java.util.Scanner;

public class ChangeInCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int strLength = sc.nextInt();
        char[] spell = null;
        spell = sc.next().toCharArray();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        spell[num1] = changeCase(spell[num1]);
        spell[num2] = changeCase(spell[num2]);

        for (char a : spell) {
            System.out.print(a);
        }
    }

    public static char changeCase(char spell) {
        if (spell < 90) {
            spell += 32;
        } else {
            spell -= 32;
        }
        return spell;
    }
}
