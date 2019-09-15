package baekjoon.problemByStep.step03;

import java.util.Scanner;

/**
 *  제목 : N 찍기
 *  문제 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *  입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *  출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class Step03_04_2741_PrintN {

    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        printNumber(input);
    }

    public static void printNumber(int number) {
        for(int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
