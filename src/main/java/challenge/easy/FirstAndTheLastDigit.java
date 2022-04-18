package dicoder;

import java.util.Scanner;

/**
 * 입력받은 숫자의 처음과 마지막 숫자의 합을 출력
 */

public class FirstAndTheLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            String num = sc.next();
            System.out.println(Integer.parseInt(num.substring(0,1)) +
                               Integer.parseInt(num.substring(num.length() - 1)));
        }
    }
}
