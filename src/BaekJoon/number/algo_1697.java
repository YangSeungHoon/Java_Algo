package BaekJoon.number;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1697
//숨바꼭질
public class algo_1697 {


    static int N;
    static int K;
    static Queue<Integer> q;
    static int[] check = new int[100001];

    public static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        q = new LinkedList<>();
    }
    public static void main(String[] args) {
        input();
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    public static void bfs(int loc) {


        q.add(loc);
        check[loc] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == K) {
                    System.out.println(check[temp]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    q.add(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }
}
