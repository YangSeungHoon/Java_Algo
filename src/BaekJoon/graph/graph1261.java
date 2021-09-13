package BaekJoon.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1261
// 알고스팟
public class graph1261 {
    static int N, M;
    static char [][] matrix;
    static int [][] dist;
    static int [] dy = {-1, 0, 1, 0};
    static int [] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputs = br.readLine().split(" ");
        M = Integer.parseInt(inputs[0]);
        N = Integer.parseInt(inputs[1]);
        matrix = new char[N][M];
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            matrix[i] = br.readLine().toCharArray();
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dijkstra();

        System.out.print(dist[N-1][M-1]);
    }

    //bfs
    public static void dijkstra() {

        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        dist[0][0] = 0;
        pq.offer(new Node(0, 0, 0)); //시작 지점.

        while(!pq.isEmpty()) {
            Node cur = pq.poll();

            for (int i = 0; i < 4; i++) {
                int nextY = cur.y + dy[i];
                int nextX = cur.x + dx[i];
                int nextWall = cur.wall;

                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= M) //matrix 밖으로 나갔는지 검사
                    continue;

                if (matrix[nextY][nextX] == '1') //이동한 곳이 벽인지 빈 공간인지 검사. 벽이라면 부숴야하니까 wall값 증가.
                    nextWall++;

                if (dist[nextY][nextX] > nextWall) { //바뀐 장소의 wall값이 업데이트 된 wall 값보다 크면 값 바꿔주기.
                    dist[nextY][nextX] = nextWall;
                    pq.offer(new Node(nextY, nextX, nextWall));
                }
            }
        }
    }

    static class Node implements Comparable<Node>{
        int y;
        int x;
        int wall;

        public Node(int y, int x, int broken) {
            this.y = y;
            this.x = x;
            this.wall = broken;
        }

        @Override
        public int compareTo(Node n) {
            return this.wall - n.wall;
        }
    }
}