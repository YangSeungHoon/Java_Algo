package BaekJoon.dp;

import java.util.Scanner;

//백준 1699 제곱근수의 합(DP)
//https://www.acmicpc.net/problem/1699
public class dp1699 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
            dp[i] = Math.min(dp[i-(j*j)]+1, dp[i]);
            }
        }
        System.out.println(dp[n]);
    }
}

//dp[0] 은 딱 제고급인 경우임. 그래서 결과적으로 1임..
//dp[1] = 1 // dp[2] = 2 // dp[3] = 3
//제곱근으로 만들어진 수 는 제곱근의 합임.
//조금 쉽게 위의 저 조건을 생각하려면 dp[i-(j*j)]가 해당 j의 제곱근으로 N이라는 수를
//나눈 뒤의 나머지라고 생각해보자.

//n이 10 이라면 j는 1,2,3 까지 돌 수있다. 각각의 경우의 수를 생각해보자.
//j가 1이라면..? dp[9] + 1이다. 즉, 1의 제곱근 하나를 쓰고 나머지가 9인데 이 녀석
//을 해결하는데 필요한 갯수는 dp[9]에 있다. 그리고 dp[9]는 2 였으니까 3이 되는 것이다.
//근데 10의 경우에는 j가 2일때가 더 작은 결괏값을 가진다. j가 2일때를 알아보자.
// j= 2 일때, dp[6] + 1 이다. 즉, 2의제곱근인 4를 10에서 빼주고 6을 해결해줘야하는데,
//이 녀석을 해결하기 위한 갯수는 dp[6]에 있다. 즉, dp[6]+1이 되는 것이다.