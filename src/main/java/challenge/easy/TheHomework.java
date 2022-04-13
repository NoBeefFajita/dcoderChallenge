package challenge.easy;

/* 테스트 케이스 수, 케이스당 수 개수, 한자리 숫자들를 순서대로
 * 입력받아 받은 숫자들로 만들 수 있는 가장 큰 수를 출력하라
 *
 * 해결법: 내림차순 정렬
 */

import java.util.*;

public class TheHomework {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCase = sc.nextInt();

        do {
            test();
        }while(--testCase != 0);
    }

    static void test() {
        int numOfNum = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            numbers.add(sc.nextInt());
        } while (numbers.size() != numOfNum);

//        Collections.sort(numbers, Collections.reverseOrder());
//        System.out.println(numbers);

//        numbers.sort(Comparator.reverseOrder());
//        System.out.println(numbers);

        sortList(numbers);
    }
    static void sortList(ArrayList<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            for (int j = i;j < numbers.size(); j++){
                if(numbers.get(i) < numbers.get(j)) {
                    int tmp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, tmp);
                }
            }
        }
        for(int n: numbers){
            System.out.print(n);
        }
        System.out.println();
    }
}
