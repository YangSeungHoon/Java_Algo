package BaekJoon.basic;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11052
//카드 구매하기
public class algo11052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n+1];

        for(int i = 1; i <= n; i++ ) {
            list[i] = sc.nextInt();
        }

        for(int i = 1; i <= n; i++) {
            list[i] = list[i] * i;
        }
        Arrays.sort(list);
        for(int i = 1; i <= n; i++) {
            System.out.println(list[i]);
        }
        System.out.println(list[n]);
    }
}
