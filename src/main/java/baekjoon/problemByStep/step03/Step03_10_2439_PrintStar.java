package baekjoon.problemByStep.step03;

import java.io.*;

/**
 * 제목 : 별 찍기 - 1
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class Step03_10_2439_PrintStar {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int step = Integer.parseInt(br.readLine());
            for (int i = 1; i <= step; i++) {
                for(int j = step-i; j > 0; j--) {
                    bw.write(" ");
                }
                for (int k = 0; k < i; k++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException ioe) {

        }
    }
}
