package baekjoon.problemByStep.step03;

import java.util.Scanner;

/**
 * 제목 : 합
 * 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 출력 : 1부터 n까지 합을 출력한다.
 */
public class Step03_03_8393_Sum {

    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        sumNumber(input);
    }

    public static void sumNumber(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
