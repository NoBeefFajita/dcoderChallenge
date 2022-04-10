package challenge.easy;

/* 분자와 분모를 순서대로 입력받아 약분한 형태(분자 분모)로 출력하라
 *
 * 해결법: 입력받은 두 값의 최대공약수 구해서 나눈 값 출력
*/

import java.util.Scanner;

public class ArchieAndHisHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(); // 분자 분모

        // 최대공약수 구하기
        int gcd = 0;
        for (int i = 2; i <= a; i++) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }

        System.out.println(gcd == 0? a + " " + b : a / gcd + " " + b / gcd);
    }
}
