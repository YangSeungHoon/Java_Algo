package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//백준 9465번 스티커(DP)
//https://www.acmicpc.net/problem/9465
public class dp9465 {

    private static int test;
    private static int N;
    private static int[][] dp;
    private static int[][] matrix;

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            //N = sc.nextInt();
            N= Integer.parseInt(br.readLine());
            matrix = new int[2][N];
            dp = new int[2][N];

            for (int i = 0; i < 2; i++) {
               String[] str = br.readLine().split(" ");
                for (int j = 0; j <N; j++) {
                    matrix[i][j] = Integer.parseInt(str[j]);
                }
            }
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    dp[0][i] = matrix[0][i];
                    dp[1][i] = matrix[1][i];
                } else if (i == 1) {
                    dp[0][i] = matrix[1][0] + matrix[0][i];
                    dp[1][i] = matrix[0][0] + matrix[1][i];
                } else {
                    dp[0][i] = Math.max(matrix[0][i] + dp[1][i - 2], matrix[0][i] + dp[1][i - 1]);
                    dp[1][i] = Math.max(matrix[1][i] + dp[0][i - 2], matrix[1][i] + dp[0][i - 1]);
                }
            }

            System.out.println(Math.max(dp[0][N - 1], dp[1][N - 1]));
        }
    }
}
