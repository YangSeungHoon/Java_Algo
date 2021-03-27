package BaekJoon.dp;


import java.util.Scanner;

//백준 10844번 쉬운 계단 수(DP)
//https://www.acmicpc.net/problem/10844
public class dp10844 {

    private static int N;
    private static int result = 0;
    private static int[][] dp = new int[101][10];
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     N= sc.nextInt();

     //끝 자리수를 기준으로 값을 넣을 것.
        //ex) 1로 끝나는 계단 수 2로 끝나는 계단 수..
     //1 자리수는 1,2,3,4,5,6,7,8,9 로 1개씩임.
     for(int i = 1; i < 10; i++) {
         dp[1][i] = 1;
     }

     for(int i = 2; i <= N; i++) {
         for(int j = 0; j < 10; j++) {
             if(j == 0) { //끝 자리가 0인 경우는 그 전에 자릿수에서 마지막이 1 로끝나는 수의 갯수에 영향을 받는다.
                 dp[i][j] = (dp[i-1][j+1]) %1000000000;
             }
             else if( j == 9) { // 끝 자리가 9인 경우는 그 전에 자릿수에서 마지막이 8로 끝나는 수의 갯수에 영향을 받는다.
                 dp[i][j] = (dp[i-1][j-1]) % 1000000000;
             } else{ // 예를들어, 끝자리가 1로 끝나는 경우는 그 전에 자릿수에서 마지막이 0으로 끝나는 것과 2로 끝나는 수들의 갯수에 영향을 받고,
                 //끝나지락 2로 끝나는 경우는 그전에 자릿수에서 마지막이 1로 끝나는 것과 3으로 긑나는 수들의 갯수에 영향을 받는다.
                 dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
             }
         }
     }

     for(int i = 0; i < 10; i++) {
         result += dp[N][i];
     }
        System.out.println(result%1000000000);
    }
}
