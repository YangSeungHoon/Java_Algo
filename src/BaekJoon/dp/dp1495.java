package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1495
//기타 리스트
public class dp1495 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] v = new int[N + 1];
        boolean[][] canPlay = new boolean[N + 1][M + 1];
        st = new StringTokenizer(br.readLine());

        v[0] = S;
        for (int i = 1; i <= N; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }


        canPlay[0][S] = true;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= M; j++) {

                if (canPlay[i - 1][j]) {

                    if (j + v[i] <= M) {
                        canPlay[i][j + v[i]] = true;
                    }
                    if (j - v[i] >= 0) {
                        canPlay[i][j - v[i]] = true;
                    }
                }
            }
        }

        boolean get = false;
        for (int i = M; i >= 0; i--) {
            if (canPlay[N][i]) {
                System.out.println(i);
                get = true;
                break;
            }
        }
        if (!get) {
            System.out.println(-1);
        }

    }
}
