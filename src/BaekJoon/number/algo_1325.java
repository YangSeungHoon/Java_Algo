package BaekJoon.number;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1325
//효율적인 해킹
public class algo_1325 {

    static class Computer{
        int idx;
        ArrayList<Computer> adj;

        public Computer(int idx) {
            this.idx = idx;
            this.adj = new ArrayList<>();
        }
    }

    static int N;
    static int M;
    static Computer[] comps;
    static int[] counts;
    static int max;
    static boolean visited[];
    public static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        counts = new int[N+1];
        comps = new Computer[N+1];
        for (int i = 1; i <= N; i++) {
            comps[i] = new Computer(i);
        }

        for(int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            comps[end].adj.add(comps[start]);
        }

        max= Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        input();


        for(int i = 1; i <= N; i++) {
            visited = new boolean[N+1];
            visited[i] = true;
            dfs(i, i);
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

        for (Computer c : comps[start].adj) {
            if (!visited[c.idx]) {
                visited[c.idx] = true;
                dfs(cur, c.idx);
                counts[cur]++;
            }
        }
    }
}
