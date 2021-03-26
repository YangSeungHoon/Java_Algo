package BaekJoon.dp;

import java.util.Scanner;

//백준 9095번 1,2,3 더하기 (DP)
//https://www.acmicpc.net/problem/9095
public class dp9095 {

    private static int test;
    private static int N;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();

        for(int i = 0; i < test; i++) {
            N = sc.nextInt();
           int[] arr = new int[11];

            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;

            for(int j = 4; j <= N; j++) {
                arr[j] = arr[j-3]+arr[j-2]+arr[j-1];
            }

            System.out.println(arr[N]);
        }
    }
}
