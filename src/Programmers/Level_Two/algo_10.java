package Programmers.Level_Two;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12945
//피보나치 수
public class algo_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = (fibo[i-2] +fibo[i-1])% 1234567;
        }
        System.out.println(fibo[n] % 1234567);
    }
}
