package dicoder;

/* 정수 배열 입력받아 요소의 차 값이 가장 큰 값을 찾아라
 * 요소 수, 요소 순으로 입력
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TheLargestGap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfElement = sc.nextInt();
        ArrayList<Integer> element = new ArrayList<>();
        int largestGap = 0;

        // 리스트 입력
        do {
            element.add(sc.nextInt());
        } while (--numOfElement != 0);

        // 가장 큰 차 값 찾기
        for(int n: element) {
            for(int m: element) {
                largestGap = Math.max(largestGap, Math.abs(n - m));
            }
        }

        // 출력
        System.out.println(largestGap);
    }
}
