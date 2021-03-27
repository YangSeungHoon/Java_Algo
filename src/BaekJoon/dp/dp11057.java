package BaekJoon.dp;


import java.util.Scanner;

//백준 11057번 오르막 수 (DP)
//https://www.acmicpc.net/problem/11057
public class dp11057 {

    private static int N;
    private static int[][] dp = new int[1001][11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                 for(int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
             }
                System.out.println(dp[i][j]);
            }
         }

        int tot = 0;
        for(int i = 0; i < 10; i++) {
            tot += dp[N][i];
        }
        System.out.println(tot%10007);
    }
}



// 3중 for문을 사용하고 싶지 않아서 인덱스 값들의 합을 10번째 인덱스에 넣는것으로 시도해 봤다. 그러나 알고리즘 적인 부분에서
// 틀렸다기보다는 뭔가 자료형 부분에서 일정 크기 이상 넘어가는 값의 처리부분이 틀렸는지, 사이트에서 틀렸다고 나온다..
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        N= sc.nextInt();
//
//        for(int i = 0; i < 10; i++) {
//            dp[1][i] = 1;
//        }
//        dp[1][10] = 10;
//
//
//        for(int i = 2; i <= N; i++) {
//
//            long tot = 0;
//            for(int j = 0; j < 11; j++) {
//                if(j == 0) {
//                    dp[i][j] = dp[i-1][10];
//                    tot += dp[i][j]% 10007;
//                } else if(j == 10) {
//                    dp[i][j] = tot;
//                }
//                else {
//                    dp[i][j] = dp[i][j-1] - dp[i-1][j-1];
//                    tot+= dp[i][j] % 10007;
//                }
//            }
//        }
//        System.out.println(dp[N][10]%10007);
//    }