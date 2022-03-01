package BaekJoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//
// 파티
public class graph1238 {

    static class Node implements Comparable<Node> {

         int dest;
        int weight;

        public Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }


        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    static int N,M,X;
    static ArrayList<Node>[] edges;
    static int dist[];

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //학생 수
        M = Integer.parseInt(st.nextToken()); // 간선 수
        X = Integer.parseInt(st.nextToken()); // 목적지
        dist = new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        edges = new ArrayList[N+1];
        for(int i = 0; i <= N; i++ ){
           edges[i] = new ArrayList();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            Node n = new Node(end,distance);
            edges[start].add(n);
        }



    }

    public static void main(String[] args) throws IOException {
      input();

      getResult();
    }

    static void getResult() {

        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        pq.add(new Node(X,0));

        while(!pq.isEmpty()) {
            Node n = pq.poll();
            int cur = n.dest;


            if(visited[cur]) continue;
            visited[cur] = true;

            for(Node node : edges[cur]){
                if(dist[node.dest] > dist[cur] + node.weight) {
                    dist[node.dest] = dist[cur] + node.weight;
                    pq.add(new Node(node.dest,dist[node.dest]));
                }
            }

        }
//        System.out.println(dist[]);
     }
}
