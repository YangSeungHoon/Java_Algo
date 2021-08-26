package BaekJoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/15650
// N과 M(2)
public class backTracking_15650 {

    public static BufferedReader br;
    public static StringTokenizer st;
    public static StringBuilder sb;
    public static int N, M;
    public static int selected[], current[];

    public static void input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M + 1];
        current = new int[M + 1];
    }

    public static void main(String[] args) throws IOException {

        input();

        recur(1);

        System.out.println(sb.toString());
    }

    public static void recur(int k) {

        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                if (selected[k - 1] < i) {
                    selected[k] = i;
                    recur(k + 1);
                }
            }
        }
    }
}
