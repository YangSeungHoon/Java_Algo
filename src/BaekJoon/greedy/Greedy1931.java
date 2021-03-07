package BaekJoon.greedy;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//백준 1931 회의실 배정
//https://www.acmicpc.net/problem/1931
public class Greedy1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[][] times = new int[n][2];

        for(int i = 0; i < n; i++) {
            times[i][0] = sc.nextInt();
            times[i][1] = sc.nextInt();
        }

        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0]; //만약에 (3,3),(3,3),(2,3) 이 제공된다면 이러한 조건이 없으면 (3,3),(3,3),(2,3) 순으로 정렬되어서 답이 두 개가된다. 그러나 다음의 조건을 통해
                }                         // (2,3),(3,3),(3,3) 으로 정렬해주면 3개가 나온다.

                return o1[1] - o2[1];
            }
        });

        int end_time = 0;

        for(int i = 0; i < n; i++) {
            if(end_time <= times[i][0]) {
                count++;
                end_time = times[i][1];
            }
        }

        System.out.println(count);
    }
}