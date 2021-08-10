package BaekJoon.number;

import java.util.HashSet;
import java.util.Scanner;

//https://www.acmicpc.net/problem/16922
//로마 숫자 만들기
public class algo_16922 {

    static int N;
    static int[] list = { 1, 5, 10, 50};
    static boolean[] visited;
    static int ans = 0;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[1001];
    }

    public static void main(String[] args) {
        input();

        recur(1, 0,0);
        System.out.println(ans);
    }

    public static void recur(int k, int value, int start) {
        if (k == N + 1) {
            if(!visited[value]) {
                visited[value] = true;
                ans++;
            }

        } else {
            for (int c = start; c < 4; c++) {
                recur(k + 1, value + list[c],c);
            }
        }
    }
}
