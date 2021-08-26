package BaekJoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backTracking_15652 {

    public static BufferedReader br;
    public static StringTokenizer st;
    public static StringBuilder sb;
    public static int N;
    public static int M;
    public static int selected[];
    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M+1];
        sb = new StringBuilder();
    }
    public static void main(String[] args) throws IOException {

        input();

        recur(1);
        System.out.println(sb.toString());
    }

    public static void recur(int k) {
        if(k == M+1) {
            for(int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }else {
            int start = selected[k-1];
            if(start == 0) start = 1;
            for(int i = start; i <= N; i++ ){
                    selected[k] = i;
                    recur(k + 1);
            }

        }
    }
}
