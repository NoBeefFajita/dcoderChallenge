package dicoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 입력받은 숫자 중 소수의 갯수를 출력
 */

public class DrPrimoVisitsArrayCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); sc.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        while(count-- != 0) {
            numbers.add(sc.nextInt());
        }

        int primeNumCount = 0;
        for (int num : numbers) {
            if(primeNumD(num)) primeNumCount++;
        }

        System.out.println(primeNumCount);
    }

    private static boolean primeNumD(int num) {
        if(num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
