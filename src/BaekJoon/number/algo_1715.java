package BaekJoon.number;

import java.util.PriorityQueue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1715
//카드 정렬하기
public class algo_1715 {


    static int N,ans;
    static PriorityQueue<Integer> pq;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        pq = new PriorityQueue<Integer>();

        for(int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }
    }
    public static void main(String[] args) {
        input();

        getMin();

        System.out.println(ans);
    }

    public static void getMin() {

        while(pq.size()> 1){
            Integer temp1 = pq.poll();
            Integer temp2 = pq.poll();
            ans += temp1+temp2;
            pq.add(temp1+temp2);
        }
    }
    }
