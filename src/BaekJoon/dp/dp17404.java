package BaekJoon.dp;

import java.io.*;

//https://www.acmicpc.net/problem/17404
//RGB2
public class dp17404 {

    public static void main(String[] args) throws IOException {
        int result = Integer.MAX_VALUE;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr= new int[n][3];
        int[][] dp = new int[n][3];
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            arr[i][0]= Integer.parseInt(str[0]);
            arr[i][1]= Integer.parseInt(str[1]);
            arr[i][2]= Integer.parseInt(str[2]);
        }

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++){
                if(i == j) {
                    dp[0][j] = arr[0][j];
                }else {
                    dp[0][j] = 1000 * 1000 + 1;;
                }
            }

            for(int j = 1; j < n; j++){
                dp[j][0] = Math.min(dp[j-1][1],dp[j-1][2]) + arr[j][0];
                dp[j][1] = Math.min(dp[j-1][0],dp[j-1][2]) + arr[j][1];
                dp[j][2] = Math.min(dp[j-1][0],dp[j-1][1]) + arr[j][2];
            }

            for(int j = 0; j < 3; j++) {
                if(i == j) continue;
                result = Math.min(result,dp[n-1][j]);
            }
        }
        System.out.println(result);
    }
    }

