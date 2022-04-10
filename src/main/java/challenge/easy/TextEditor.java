package challenge.easy;

// 알파벳 소문자 N 단어 입력받아 대문자로 출력 (N words 순서 입력)

import java.util.Scanner;

public class TextEditor {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int numOfWord = sc.nextInt();
        for(int i = 0; i < numOfWord; i ++) {
            System.out.println(sc.next().toUpperCase());
        }
    }
}
