package challenge.easy;

/* 배열 요소 수, 요소 순서대로 입력받아
 * (1 - index)가 짝수인 요소의 값이 짝수인
 * 요소를 출력
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DivideTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfElement = sc.nextInt();
        ArrayList<Integer> element = new ArrayList<>();

        while(numOfElement-- != 0) {
            element.add(sc.nextInt());
        }

        for (int i = 1; i < element.size(); i += 2) {
            if(element.get(i) % 2 == 0)
                System.out.print(element.get(i) + " ");
        }
    }
}
