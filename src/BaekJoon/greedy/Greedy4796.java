package BaekJoon.greedy;


import java.util.Scanner;


//백준 4796번 캠핑
//https://www.acmicpc.net/problem/4796
public class Greedy4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int L = sc.nextInt(); //5
            int P = sc.nextInt(); //8
            int V = sc.nextInt(); //20
            int answer = 0;

            if (L == 0 && P == 0 && V == 0) break;

            answer += (V / P) * L;
            int remains = V % P;

            if (remains <= L) {
                answer += remains;
            } else {
                answer += L;
            }

            System.out.printf("Case %d: %d\n", i, answer);
            i++;
        }
    }
}
