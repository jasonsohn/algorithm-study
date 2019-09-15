package baekjoon.problemByStep.step03;

import java.util.Scanner;

/**
 *  제목 : 기찍 N
 *  문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *  입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *  출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class Step03_05_2742_PrintNDesc {
    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        printNumberDesc(input);
    }

    public static void printNumberDesc(int number) {
        for(int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
