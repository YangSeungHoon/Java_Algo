package BaekJoon.number;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1904
//01타일
public class algo_1904 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[]dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        if(n >= 2) {
            for (int i = 2; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
            }
        }

        System.out.println(dp[n]);
    }
}
