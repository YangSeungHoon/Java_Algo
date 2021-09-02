package BaekJoon.graph;

import java.util.Scanner;

// 백준 10451번 순열 사이클
//https://www.acmicpc.net/problem/10451
public class dfs10451 {

    private static int test;
    private static int N;
    private static int count;
    private static int[] graph;

    private static boolean[] visited;


    private static void dfs(int i) {

        if(visited[i]) return;

        visited[i] = true;

        dfs(graph[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        test = sc.nextInt();

        for (int t = 0; t < test; t++) {
            graph = new int[1001];

            visited = new boolean[1001];
            count = 0;
            N = sc.nextInt();

            for (int i = 1; i <= N; i++) {
                graph[i] = sc.nextInt();
            }

            for (int i = 1; i <= N; i++) {

                if (visited[i] != true) {
                    dfs(i);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}


