package baekjoon.problemByStep.step04;

import java.io.*;

public class Step04_03_1110_AddCycle {
    public static void main(String[] args) {
        addCycle();
    }

    public static void addCycle() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
//            System.out.println("출력");
            int operand = Integer.parseInt(br.readLine());
            String input = "";
            String result = "";
            String resultNumber = "";
            String operandStr = String.valueOf(operand);
            int cnt = 0;
            while (!operandStr.equals(resultNumber)) {

                if (operand < 10) {
                    input = "0" + operand;
                } else {
                    input = String.valueOf(operand);
                }
                String[] str = input.split("");
                int operand1 = Integer.parseInt(str[0]);
                int operand2 = Integer.parseInt(str[1]);
//                System.out.println("operand1:" + operand1);
//                System.out.println("operand2:" + operand2);

                int sum = operand1 + operand2;
                if (sum < 10) {
                    result = "0" + sum;
                } else {
                    result = String.valueOf(sum);
                }
                String[] res = result.split("");

                int result1 = Integer.parseInt(res[0]);
                int result2 = Integer.parseInt(res[1]);
//                System.out.println("result1:" + result1);
//                System.out.println("result2:" + result2);

                resultNumber = String.valueOf(operand2) + result2;
                resultNumber = String.valueOf(Integer.parseInt(resultNumber));

//                System.out.println(resultNumber);
                operand = Integer.parseInt(resultNumber);
                cnt++;
//                System.out.println("cnt출력:" +cnt);
//                if(cnt>100) {
//                    System.exit(0);
//                }
            }
            System.out.println(cnt);

            //bw.flush();
        } catch (IOException ioe) {

        }
    }
}
