package BaekJoon.dfs;

import java.util.Scanner;

// 백준 1012번 유기농 배추
//https://www.acmicpc.net/problem/1012
public class dfs1012 {

    private static int test;

    private static int M; //가로
    private static int N; //세로
    private static int K; //배추 개수

    private static int[][] graph = new int[50][50];
    private static int[][] visited = new int[50][50];

    private static int[] moveX = {1,-1,0,0};
    private static int[] moveY = {0,0,-1,1};

    private static int count = 0;


    private static void dfs(int x, int y) {

        visited[x][y] = 1;

        for(int i = 0; i < 4; i++) {
            int nx = x + moveX[i];
            int ny = y + moveY[i];

            if(nx < 0 || ny <0 || nx >=M || ny >= N) continue;

            if(graph[nx][ny] != 1 || visited[nx][ny] == 1) continue;

            dfs(nx,ny);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        test = sc.nextInt();

        for (int t = 0; t < test; t++) {

            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();

            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                graph[x][y] = 1;
            }


            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {

                    if (visited[i][j] != 1 && graph[i][j] == 1) { //방문하지 않았고, 배추가 있다면..?
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
            graph = new int[50][50];
            visited = new int[50][50];
        }
    }
}
