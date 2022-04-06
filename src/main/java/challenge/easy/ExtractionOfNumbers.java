package challenge.easy;
/*Extraction of Numbers
Ron is schizophrenic and sees random digits hidden in words.
He thinks it means something and someone is trying to secretly
communicate with him. He wants to extract those digits from
the words and see if they form a message. Harry really wants
to help him but couldn't think of a way. But, Harry finally
realized that if he somehow helps Ron in extracting those digits,
Ron will finally realize that they don't mean anything and are
just his delusions. He asked Ron to write down all the words
that he sees. Help Harry by extracting the digits from these words.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtractionOfNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numOfWord = sc.nextInt();sc.nextLine();
        String[] words = sc.nextLine().split("");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));

        for( String a : wordList){
            try{
                System.out.print(Integer.parseInt(a) + " ");
            } catch(NumberFormatException e) {}
        }
    }
}
