package BaekJoon.number;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1766
//문제집
public class algo_1766 {

    static int N,M;
    static ArrayList<Integer>[] list;
    static int[] indegree;
    public static void input() {

        Scanner sc= new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list= new ArrayList[N+1];
        indegree= new int[N+1];

        for(int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();
            list[temp1].add(temp2);
            indegree[temp2]++;
        }
    }

    public static void main(String[] args) {
        input();

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        for(int i=1; i<=N; i++){
            //indegree가 0인 값들 모두 큐에 넣어준다.
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            //indgree가 0인 값을 큐에서 뽑는다.
            int current = q.poll();
            System.out.print(current+" ");
            //뽑힌 곳에서 갈 수 있는 곳들을 검색하여 indegree를 -1한다.(자신을 가르키는 화살표가 하나 사라졌기 때문에)
            for(int i=0; i<list[current].size(); i++){
                int next = list[current].get(i);
                indegree[next]--;
                //indegree가 0이라면 큐에 넣는다.
                if(indegree[next]==0){
                    q.add(next);
                }
            }
        }
    }

}
