package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/15649
//N과 M(1)
public class algo_15649 {

    public static BufferedReader br;
    public static StringTokenizer st;
    public static int N;
    public static int M;
    public static int selected[] ,used[];
    public static StringBuilder sb;

    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M+1];
        used = new int[N+1];
        sb = new StringBuilder();
    }

    public static void main(String[] args) throws IOException {

        input();

        recur(1);

        System.out.println(sb.toString());
    }

    public static void recur(int k) {
        if(k == M + 1) {
            for(int i = 1; i <=M; i++ ){
                    sb.append(selected[i]).append(" ");
                }

            sb.append("\n");
        }else{
             for(int i = 1; i <= N; i++) {
                 if(used[i] == 1) continue;

                     selected[k] = i;
                     used[i] = 1;

                     recur(k + 1);
                     used[i] = 0;
                 }
             }
        }
    }



