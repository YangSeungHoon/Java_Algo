package BaekJoon.number;

import java.util.Scanner;

public class algo_11053 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i ++) {
            list[i] = sc.nextInt();
            dp[i] = 1;
        }
        int max = 0;

        for(int i = 0; i < n; i++) {
            for(int j= 0; j < i; j++) {

                if(list[i] > list[j] && dp[i]< dp[j] +1){
                    dp[i] = dp[j]+1;
                }
            }
            max= Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
