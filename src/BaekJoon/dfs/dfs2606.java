package BaekJoon.dfs;


import java.util.Scanner;

//백준 2606번 바이러스
//https://www.acmicpc.net/problem/2606
public class dfs2606 {

    public static int N; // 점
    public static int V; // 간선

    public static int count = 0;

    public static int[][] computers = new int[101][101];

    public static boolean[] check = new boolean[101];


    public static int dfs(int i) {

        check[i] = true;
       // count++; 만약에 count를 여기다 두면 감염된 모든 컴퓨터를 의미하는 것으로 12356 값이 5가 나온다. 그러나 내가 구하고자 하는 것은 1로인해
        // 감염된 컴퓨터의 수 이기때문에.. 아래에다가 count를 둬야한다.
        for(int j = 1; j <= N; j++) {

            if(computers[i][j] != 1 || check[j] == true) continue;
            dfs(j);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        V = sc.nextInt();


        for(int i = 0; i < V; i++) {
            int x = Integer.parseInt(sc.next());
            int y= Integer.parseInt(sc.next());
            computers[x][y] = 1;
            computers[y][x] = 1;
        }
        dfs(1);

        System.out.println(count);
    }

}
