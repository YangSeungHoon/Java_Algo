package BaekJoon.dp;

import java.util.Scanner;

//백준 11727번 2 x n 타일링(DP)
//https://www.acmicpc.net/problem/11727
public class dp11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++)
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;

        System.out.println(dp[n]);
    }
}

