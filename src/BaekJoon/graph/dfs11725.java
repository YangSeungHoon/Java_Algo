package BaekJoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//백준 11725번 트리의 부모 찾기
//https://www.acmicpc.net/problem/11725
public class dfs11725 {

    private static int N;
    private static ArrayList<Integer>[] lists;
    private static int[] parents;


    private static void dfs(ArrayList<Integer>[] list,int[] parents,int start, int parent) {

        parents[start] = parent;

        for(int item: list[start]) {
            if(item != parent) {
                dfs(list,parents,item,start);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        lists = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) {
            lists[i] = new ArrayList<Integer>();
        }


        for(int i = 1 ; i <= N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            lists[x].add(y);
            lists[y].add(x);
        }

        parents = new int[N+1];

        dfs(lists,parents,1,0);

        for(int i = 2; i <=N; i++) {
            System.out.println(parents[i]);
        }

    }
}
