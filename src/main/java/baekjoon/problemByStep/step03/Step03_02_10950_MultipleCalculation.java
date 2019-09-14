package baekjoon.problemByStep.step03;

import java.util.Scanner;

/**
 * 제목 : A + B - 3
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Step03_02_10950_MultipleCalculation {
    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        int step = scanner.nextInt();
        for (int i = 0; i < step; i++) {
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();
            System.out.println(operand1 + operand2);
        }
//        startCalculation(step, operand1, operand2);
//        startCalculation(step);
    }

    public static void startCalculation(int step) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < step; i++) {
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();
            int result = operand1 + operand2;
            System.out.println(result);
        }
    }

    public static void startCalculation(int step, int operand1, int operand2) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < step; i++) {
            int result = operand1 + operand2;
            System.out.println(result);
        }
    }
}
