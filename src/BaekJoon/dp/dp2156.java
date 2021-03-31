package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2156번 포도주
//https://www.acmicpc.net/problem/2156
public class dp2156 {

    private static int N;
    private static int[] dp;
    private static int[] input;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        input = new int[N+1];

        for(int i = 1; i <= N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = input[1];

        if(N > 1) {
            dp[2] = input[1]+input[2];
        }

        for(int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-1],Math.max(dp[i-3]+input[i-1]+input[i],dp[i-2]+input[i]));
        }

        System.out.println(dp[N]);
    }
}


//1. oox, oxo, xoo 의 경우가 존재한다.
//
//        1-2. oox 의 경우 dp[i-1] 가 된다. 마시고, 마시고, 안마시고
//
//        1-3. oxo 의 경우 dp[i-2] + arr[i] 가 된다. 마시고, 안마시고, 마시고
//
//        1-4. xoo 의 경우 do[i-3] + arr[i-1] + arr[i] 가 된다. 안마시고, 마시고, 마시고 이 경우에는 첫 x 이전의 값 즉, oxoo라고 생각하고
//                                                            기존의 o에다가 띄고 o,o를 더한다.
//
//        2. 위의 3경우중 가장 큰 값을 선택하면 된다.
//
//        dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])) 라는 수식이 나온다.
