package BaekJoon.basic;

import java.util.Scanner;

// 백준 1463번 1로 만들기
//https://www.acmicpc.net/problem/1463
public class algo1463 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] list = new int[n+1];

        list[1] = 0;
        for(int i = 2; i <= n; i++) {
            list[i] = list[i-1]+1;

            if(i % 2 == 0 && list[i] > list[i/2]+1){
                list[i] = list[i/2]+1;
            }

            if(i % 3 ==0 && list[i] > list[i/3]+1){
                list[i] = list[i/3]+1;
            }
        }
        System.out.println(list[n]);
    }
}
