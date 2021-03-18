package BaekJoon.dfs;

import java.util.Scanner;
//백준 4963번 섬의 개수
//https://www.acmicpc.net/problem/4963
public class dfs4963 {

    private static int[][] graph;
    private static boolean[][] visited;

    private static int[] directionX ={-1, 1, 0, 0, -1, -1, 1, 1};
    private static int[] directionY ={0, 0, -1, 1, -1, 1, -1, 1};
    private static int w;
    private static int h;
    private static int count;

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < 8; i++) {
            int nx = x+directionX[i];
            int ny = y+directionY[i];

            if(nx < 0 || ny < 0 || nx >= h || ny >= w)  continue;

            if(visited[nx][ny] == true || graph[nx][ny] == 0) continue;

            dfs(nx,ny);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            graph = new int[50][50];
            visited = new boolean[50][50];
            count = 0;
            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0) break;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    graph[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {

                    if (graph[i][j] == 1 && visited[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
