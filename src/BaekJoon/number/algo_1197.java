package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1197
// 최소 스패닝 트리
public class algo_1197 {

    public static class Edge implements Comparable<Edge> {
        int v1,v2,weight;

        public Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    static BufferedReader br;
    static StringTokenizer st;
    static int V,E;
    static int[] parent;
    static PriorityQueue<Edge> pq;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());


        parent = new int[V+1];
        for(int i = 1; i <= V; i++)
            parent[i]= i;

        pq = new PriorityQueue<>();
        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            pq.offer(new Edge(a,b,w));
        }
    }

    public static void kru() {
        int weight = 0;
        while(!pq.isEmpty()) {
            Edge now = pq.poll();
            if(find(now.v1) != find(now.v2)) {
                union(now.v1, now.v2);
                weight += now.weight;
            }
        }

        System.out.println(weight);
    }

    public static void union(int n1, int n2) {
        int p1 = find(n1);
        int p2 = find(n2);

        if(p1 < p2)
            parent[p2] = p1;
        else
            parent[p1] = p2;
    }

    public static int find(int n) {
        if(parent[n] == n)
            return n;
        else {
            parent[n] = find(parent[n]);
            return parent[n];
        }
    }

    public static void main(String[] args) throws IOException {

        input();

        kru();
    }
}
