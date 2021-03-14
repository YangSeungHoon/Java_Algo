package BaekJoon.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//백준 2667번 단지번호 붙이기
//https://www.acmicpc.net/problem/2667
public class dfs2667 {

    private static int N;
    private static int[][] graph = new int[25][25];

    private static boolean[][] visited = new boolean[25][25];

    private static int[] xdir = {-1,1,0,0};
    private static int[] ydir = {0,0,1,-1};

    private static List<Integer> result = new ArrayList<>();
    private static int count = 0;

    public static int dfs(int x,int y) {


        visited[x][y] = true;

        for(int i = 0 ; i < 4; i++) {
            int nx = x + xdir[i];
            int ny = y + ydir[i];

            if(nx >= N || nx < 0 || ny >= N || ny < 0) continue;

            if(graph[nx][ny] == 0 || visited[nx][ny] == true) continue;


            dfs(nx,ny);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String str = sc.next();
            for(int j = 0; j < N; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(graph[i][j] == 1 && visited[i][j] == false){
                    count = 1;
                    dfs(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for(Integer e : result) {
            System.out.println(e);
        }
    }
}
