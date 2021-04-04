package BaekJoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 1912번 연속합(DP)
//https://www.acmicpc.net/problem/1912
public class dp1912 {

    private static int N;
    private static int[] dp;
    private static int[] arr;
    private static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[N];
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        result = arr[0];

        for(int i = 1; i <N; i++ ) {

            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);

           result =  Math.max(result,dp[i]);
        }
        System.out.println(result);
    }
}
