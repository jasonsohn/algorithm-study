package baekjoon.problemByStep.step04;

import java.io.*;

/**
 * 제목 : A+B - 5
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력의 마지막에는 0 두 개가 들어온다.
 * 출력 : 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Step04_01_10952_MultipleCalculation {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            boolean flag = true;

            while (flag) {
                String[] str = br.readLine().split(" ");
                int operand1 = Integer.parseInt(str[0]);
                int operand2 = Integer.parseInt(str[1]);
                int result = operand1 + operand2;
                if (operand1 == 0 && operand2 == 0) {
                    break;
                }
                bw.write(String.valueOf(result));
                bw.newLine();
            }
            bw.flush();

        } catch (IOException ioe) {

        }
    }

}
