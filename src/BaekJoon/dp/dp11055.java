package BaekJoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 11055번 가장 큰 증가 부분 수열
//https://www.acmicpc.net/problem/11055
public class dp11055 {

    private static int N;
    private static int[] dp;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        arr= new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        int result= dp[1];

        for(int i = 2; i  <= N; i++) {
            dp[i] = arr[i];
            for(int j = 1; j < i; j++) {
                if(arr[i] > arr[j]) {

                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                    System.out.println(dp[i]);
                }
            }
            result = Math.max(result,dp[i]);
        }
        System.out.println(result);
    }
}
