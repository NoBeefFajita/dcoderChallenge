package challenge.easy;
/*Finding Nemo
Nemo is a little kid in Word-World who always gets mixed in
 a group of other words and gets lost. Marlin and Coral
 (Nemo's parents) are quite desperate and called you for help
 every time Nemo got lost. You helped for the first few times
 but got irritated when you were called upon again and again.
 So write an algorithm that would do your work for you. You will
 be given a group of words. You need to find 'Nemo' among these
 words and print its position.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindingNemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numOfWord = sc.nextInt();
        sc.nextLine();
        String words = sc.nextLine();
        String[] wArray = words.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wArray));
        sc.close();

        System.out.print(wordList.indexOf("Nemo")+1);
    }
}
