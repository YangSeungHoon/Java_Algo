package BaekJoon.number;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2012
//등수 매기기
public class algo_2012 {


    static int N;
    static int[] scores;
    static void input() {
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        scores = new int[N+1];

        for(int i = 1; i <= N; i++) {
            scores[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void getMinDissatisfaction() {
        Arrays.sort(scores);
        long result = 0;
        for(int i = 1; i <= N; i++) {
            result +=  Math.abs(scores[i] - i);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        input();

        getMinDissatisfaction();
    }

}
