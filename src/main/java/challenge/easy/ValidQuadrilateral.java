package dicoder;

import java.util.Scanner;

/**
 * 입력된 4개의 각이 사각형의 네 각인가?
 */

public class ValidQuadrilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            if (sum == 360) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
