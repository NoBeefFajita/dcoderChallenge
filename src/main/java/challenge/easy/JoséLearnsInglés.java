package challenge.easy;
/*José learns inglés
José is from South America and hence, Spanish is his mother tongue.
He wants to travel around the world and, therefore, decides to learn
various languages, starting with English. He tries to learn the
alphabetical order.. You being a good teacher will help him in doing
so. He said he would learn just by asking questions. You have to answer
his questions. You will be given few characters. You need to arrange
them in alphabetical order and print them.
NOTE: Do not mind the case. (example : 'D' will come after 'a' in alphabetical order)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoséLearnsInglés {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfChar = sc.nextInt();
        sc.nextLine();
        String[] alphabet = sc.nextLine().split(" ");
        ArrayList<String> alphabetList = new ArrayList<>(List.of(alphabet));
        alphabetList.sort(String.CASE_INSENSITIVE_ORDER);

        for( String a :alphabetList ){
            System.out.print(a + " ");
        }
    }
}
