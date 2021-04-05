package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2579번 계단 오르기
//https://www.acmicpc.net/problem/2579
public class dp2579 {

    private static int N;
    private static int[] arr;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] arr = new int[N + 1];


        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // index = 0 은 시작점이다.
        dp[1] = arr[1];

        // N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for(int i = 3; i <= N; i++) {

            dp[i] = Math.max(dp[i -2],dp[i-3]+arr[i-1])+arr[i];
        }
        System.out.println(dp[N]);
    }
}
