package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/1781
// 컵라면
public class algo_1781 {

    static class Problem implements Comparable<Problem> {
        int limit;
        int amount;

        public Problem(int limit, int amount) {
            this.limit = limit;
            this.amount = amount;
        }


        @Override
        public int compareTo(Problem o) {
            return limit - o.limit;
        }
    }

    static int N;
    static long result;
    static ArrayList<Problem> problems = new ArrayList<>();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            Problem p = new Problem(temp1,temp2);
            problems.add(p);
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        getResult();
    }

    public static void getResult() {
        Collections.sort(problems);

        pq.add(problems.get(0).amount);

        for(int i = 1; i <problems.size(); i++) {
            int getAmount = problems.get(i).amount;
            pq.add(getAmount);

            if(pq.size() > problems.get(i).limit) pq.poll();
        }
        while(!pq.isEmpty()){
            int temp = pq.poll();
            result+= temp;
        }
        System.out.println(result);
    }

}
