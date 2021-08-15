package BaekJoon.number;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1325
//효율적인 해킹
public class algo_1325 {

    static int N;
    static int M;
    static int[][] edge;;
    static int[] counts;
    static int max;
    public static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        counts = new int[N+1];
        edge = new int[N+1][N+1];
        for(int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            edge[start][end] = 1;
        }
        max= Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        input();

        for(int i = 1; i <= N; i++) {
            dfs(i,i);
            max = Math.max(counts[i],max);
        }
        StringBuilder sb = new StringBuilder();
        for(int i= 1; i <= N; i++){
            if(counts[i] == max){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString());

    }

    public static void dfs(int cur,int start){

        for(int i = 1; i <= N; i++){

            if(edge[i][start] == 1){
                counts[cur]++;
                dfs(cur,i);
            }

        }
    }
}
