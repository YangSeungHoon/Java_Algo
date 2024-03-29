package BaekJoon.dp;

import java.util.Scanner;

//백준 1463번 1로 만들기(DP)
//https://www.acmicpc.net/problem/1463
public class dp1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) { //최종 숫자는 n이기 때문에 n까지 반복연산
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[n]);
        sc.close();
    }
}