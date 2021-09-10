package BaekJoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/1916
// 최소비용 구하기
public class graph1916 {

    static class City implements Comparable<City> {
        int dest;
        int weight;

        public City(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }


        @Override
        public int compareTo(City o) {
            return weight - o.weight; //오름차순
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int N,M;
    static int[] destinations;
    static List<City>[] list;
    static int s,e;
    static void input() throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        destinations = new int[N+1];
        Arrays.fill(destinations,INF);
        list = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++) {
            list[i] =  new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());


        for(int i = 1; i <= M; i++) {
             st = new StringTokenizer(br.readLine());
             int start = Integer.parseInt(st.nextToken());
             int end = Integer.parseInt(st.nextToken());
             int weight = Integer.parseInt(st.nextToken());

             list[start].add(new City(end,weight));
        }

        st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

    }

    public static void main(String[] args) throws IOException {
        input();

        dijkstra(s);
    }

    static void dijkstra(int start) {
        PriorityQueue<City> pq = new PriorityQueue<>();
        boolean[] check = new boolean[N + 1];
        destinations[start] = 0;
        pq.add(new City(start,0));

        while(!pq.isEmpty()) {
            City city = pq.poll();
            int cur = city.dest;

            if(check[cur]) continue;
            check[cur] = true;



            for(City ct : list[cur]){
                if(destinations[ct.dest] > destinations[cur] + ct.weight) {
                    destinations[ct.dest] = destinations[cur] + ct.weight;
                    pq.add(new City(ct.dest,destinations[ct.dest]));
                }
            }
        }

        System.out.println(destinations[e]);
    }

}
