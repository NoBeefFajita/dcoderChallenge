package dicoder;

import java.util.Scanner;

/**
 *  입력된 가격이 1000원을 초과하면 10%의 디스카운트하여 출력
 */

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            double price = sc.nextDouble();
            if (price <= 1000) System.out.printf("%.2f\n", price);
            else System.out.printf("%.2f\n", 0.9 * price);
        }
    }
}
