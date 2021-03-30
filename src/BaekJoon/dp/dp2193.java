package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//백준 2193번 이친수(DP)
//https://www.acmicpc.net/problem/2193
public class dp2193 {
    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new long[N+1];

        dp[0] = 0;
        dp[1] =1;

        for(int i =2; i <= N; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[N]);
    }
}
