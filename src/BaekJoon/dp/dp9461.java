package BaekJoon.dp;

import java.util.Scanner;

//백준 9461번 파도반 수열(DP)
//https://www.acmicpc.net/problem/9461
public class dp9461 {

    private static int test;
    private static long[] dp;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        test = sc.nextInt();

        for(int i = 0; i < test; i++) {
            int n = sc.nextInt();
            dp = new long[n+1];

            dp[0] = 0;
            dp[1] = 1;

            if(n >= 2){
                dp[2]= 1;
            }

            for(int j = 3; j <= n; j++) {
                dp[j] = dp[j-3]+dp[j-2];
            }
            System.out.println(dp[n]);
        }
    }
}
