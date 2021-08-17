package BaekJoon.number;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/10282
// 해킹
public class algo_10282 {

    public static class Computer implements Comparable<Computer> {
        int computer;
        int second;

        public Computer(int computer,int second) {
            this.computer = computer;
            this.second  = second;
        }

        @Override
        public int compareTo(Computer o) {
            return this.second - o.second;
        }
    }

    static BufferedReader br;
    static StringTokenizer st;

    static int test;
    static int amount,depen,start,count;
    static ArrayList<Computer>[] coms;
    static boolean[] visited;
    static int[] dist;
    static PriorityQueue<Computer> q;
    public static void inputAndStart() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        test = Integer.parseInt(br.readLine());
        for(int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());
            amount = Integer.parseInt(st.nextToken());
            depen = Integer.parseInt(st.nextToken());
            start = Integer.parseInt(st.nextToken());

            coms = new ArrayList[amount+1];
            for(int j = 1; j <= amount; j++) {
                coms[j]= new ArrayList<>();
            }

            for(int j = 1; j <= depen; j++) {
                st = new StringTokenizer(br.readLine());
                int temp1 = Integer.parseInt(st.nextToken());
                int temp2 = Integer.parseInt(st.nextToken());
                int temp3 = Integer.parseInt(st.nextToken());

                coms[temp2].add(new Computer(temp1,temp3));
            }

            count = 0;
            dist = new int[amount+1];
            visited = new boolean[amount+1];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[start] = 0;

            dijkstra();

            int time = 0;
            for(int j = 1; j <= amount; j++) {
                if(dist[j] != Integer.MAX_VALUE) time = Math.max(time,dist[j]);
            }

            System.out.println(count+" "+time);
        }
    }

    public static void dijkstra() {
        q = new PriorityQueue<>();
        q.offer(new Computer(start,0));

        while (!q.isEmpty()){
            Computer c = q.poll();

            if(!visited[c.computer]){
                visited[c.computer] = true;
                count++;
            }else continue;


            for(int i = 0; i < coms[c.computer].size(); i++) {

                Computer next = coms[c.computer].get(i);

                if(dist[next.computer] > dist[c.computer] + next.second){
                    dist[next.computer] = dist[c.computer] + next.second;
                    q.offer(new Computer(next.computer,dist[next.computer]));
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        inputAndStart();
    }

}
