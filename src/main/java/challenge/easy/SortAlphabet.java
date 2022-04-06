package challenge.easy;

import java.util.Scanner;

public class SortAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = sc.nextLine().toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = i; j < alphabet.length; j++) {
                if((alphabet[i] < alphabet[j] && alphabet[i] < 90 && alphabet[j] >90)
                || (alphabet[i] > alphabet[j] && alphabet[i] < 90)
                || (alphabet[i] > alphabet[j] && alphabet[j] > 90)) {
                    char tmp = alphabet[i];
                    alphabet[i] = alphabet[j];
                    alphabet[j] = tmp;
                }
            }
        }
        System.out.println(alphabet);
    }
}
