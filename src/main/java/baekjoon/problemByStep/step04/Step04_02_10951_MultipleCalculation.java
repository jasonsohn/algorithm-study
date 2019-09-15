package baekjoon.problemByStep.step04;

import java.io.*;
import java.util.Scanner;

/**
 * 제목 : A+B - 4
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Step04_02_10951_MultipleCalculation {
    public static void main(String[] args) {
//        calculate();
        calculate1();
    }

    public static void calculate1() {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println(a+b);
        }
    }

    public static void calculate() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            boolean flag = true;
//            String[] str;
            String input = "";

            while (br != null) {
                String[] str = br.readLine().split(" ");
                int operand1 = Integer.parseInt(str[0]);
                int operand2 = Integer.parseInt(str[1]);
                int result = operand1 + operand2;
//                if (operand1 == 0 && operand2 == 0) {
//                    break;
//                }
                bw.write(String.valueOf(result));
                bw.newLine();
            }
            bw.flush();

        } catch (IOException ioe) {

        }
    }
}
