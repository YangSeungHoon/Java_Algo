package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//https://www.acmicpc.net/problem/12865
//평범한 배낭
public class algo_12865 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int[] w = new int[n+1];// 무게
        int[] v = new int[n+1];// 가치
        int[][] result =  new int[n+1][k+1]; //결과 배열

        for(int i = 1; i <= n; i++){
            str = br.readLine().split(" ");
            w[i] = Integer.parseInt(str[0]);
            v[i] = Integer.parseInt(str[1]);
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= k; j++) {
                if(w[i] > j) {
                    result[i][j] = result[i-1][j];
                }else{
                    result[i][j] = Math.max(result[i-1][j],result[i-1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.println(result[n][k]);
    }
}
