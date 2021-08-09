package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/14888
//연산자 끼워넣기
public class algo_14888 {

    public static BufferedReader br;
    public static StringTokenizer st;
    public static int count;
    public static int numbers[];
    public static int op[]; // +,-,*,//
    public static int min,max;
    public static StringBuilder sb;

    public static void input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        count = Integer.parseInt(st.nextToken());
        numbers = new int[count+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= count; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        op = new int[5];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < op.length; i++){
            op[i] = Integer.parseInt(st.nextToken());
        }
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        sb = new StringBuilder();
    }
    public static void main(String[] args) throws IOException {
        input();

        recur(1,numbers[1]);

        sb.append(max).append(" ").append(min);
        System.out.println(sb.toString());
    }

    public static void recur(int k, int value){
        if (k == count) {
            // 완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            // k 번째 연산자는 무엇을 선택할 것인가?
            for (int cand = 1; cand <= 4; cand++){
                if (op[cand] >= 1){
                    op[cand]--;
                    recur(k + 1, calculator(value, cand, numbers[k + 1]));
                    op[cand]++;
                }
            }
        }
    }

    static int calculator(int operand1, int operator, int operand2){
        // value, order[i], num[i+1]
        if (operator == 1) // +
            return operand1 + operand2;
        else if (operator == 2) // -
            return operand1 - operand2;
        else if (operator == 3) // *
            return operand1 * operand2;
        else // /
            return operand1 / operand2;
    }
}
