package BaekJoon.dp;


import java.util.Scanner;

//백준 11053번 가장 긴 증가하는 부분 수열
//https://www.acmicpc.net/problem/11053
public class dp11053 {

    private static int N;

    private static int[] arr;
    private static int[] dp;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        dp = new int[N];

        //dp에다가 길이의 갯수를 넣을 것임..
        for(int i = 0; i < N; i++) {
            dp[i] = 1;
        }

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0 ; j < i; j++) {

                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max= 0;
        for(int i = 0; i < N; i++) {
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        System.out.println(max);
    }

}