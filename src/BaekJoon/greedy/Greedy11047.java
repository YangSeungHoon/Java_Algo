package BaekJoon.greedy;


import java.util.Scanner;

//백준 11047번 동전
//https://www.acmicpc.net/problem/11047
public class Greedy11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        for (int i = coins.length - 1; i >= 0; i--) {

            if (k == 0) {
                break;
            }

            if (k / coins[i] >= 1) {
                count += k / coins[i];
                k = k % coins[i];
            }
        }

        System.out.println(count);
    }
}
