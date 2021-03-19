package BaekJoon.dfs;


import java.util.*;

//백준 2468번 안전 영역
//https://www.acmicpc.net/problem/2468
public class dfs2468 {

    private static int N;
    private static int max = 0;

    private static int[][] graph = new int[100][100];
    private static boolean[][] visited = new boolean[100][100];
    private static List<Integer> counts = new ArrayList<>();

    private static int[] directionX = {-1,1,0,0};
    private static int[] directionY = {0,0,-1,1};

    private static int count;

    private static void dfs(int x,int y, int height) {

        visited[x][y] = true;

        for(int i = 0; i < 4; i ++) {
            int nx = directionX[i] + x;
            int ny = directionY[i] + y;

            if(nx < 0 || ny < 0 || nx >=N || ny >= N)continue;

            if(graph[nx][ny] <= height || visited[nx][ny] == true ) continue;

            dfs(nx,ny,height);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        N= sc.nextInt();

        for(int i = 0; i< N; i++) {
            for(int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();

                if(max < graph[i][j]){
                    max = graph[i][j];
                }
            }
        }

        for(int i = 0; i <= max; i++){
            visited = new boolean[100][100];
            count = 0;
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {

                    if(graph[j][k] > i && visited[j][k] != true) {
                        dfs(j,k,i); //x,y,높이
                        count++;
                    }
                }

            }
            counts.add(count);
        }

        Integer answer = Collections.max(counts);
        System.out.println(answer);
    }
}
