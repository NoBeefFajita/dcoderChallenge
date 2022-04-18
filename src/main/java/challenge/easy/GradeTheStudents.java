package dicoder;

import java.util.Scanner;

/**
 * 수학과 알고리즘 과목의 점수를 순서대로 입력받아 합격 불합격 여부를 출력
 * 합격 조건:
 * 1. 수학 점수가 70점 초과
 * 2. 알고리즘 점수가 50점 초과
 */

public class GradeTheStudents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        for (int i = 0; i < students; i++) {
            int math = sc.nextInt();
            int algorithm = sc.nextInt();
            System.out.println(passDiscriminator(math, algorithm));
        }
    }

    private static String passDiscriminator(int math, int algorithm) {
        if (math > 70 && algorithm > 50) return "Pass";
        else return "Fail";
    }
}
