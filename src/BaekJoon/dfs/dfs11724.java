package BaekJoon.dfs;


import java.util.Scanner;

// 백준 11724번 연결 요소의 개수
//https://www.acmicpc.net/problem/11724
public class dfs11724 {

    private static int N;
    private static int M;
    private static int count= 0;

    private static int[][] graph;
    private static boolean[] visited;


    private static void dfs(int i) {

        visited[i] = true;

        for(int j = 1; j < N+1; j++) {

            if(graph[i][j] != 1 || visited[j] == true) continue;

            dfs(j);
        }

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        for(int i = 1; i < N+1; i++) {
                if(!visited[i]){ //연결되어 있고, 방문안했고.
                    dfs(i);
                    count++;
                }
            }
        System.out.println(count);
    }
}
