package BaekJoon.basic;

import java.util.Scanner;
// 백준 17087번 숨바꼭질 6
//https://www.acmicpc.net/problem/17087
public class algo17087 {

    public static int gcd(int a, int b) {

        int n;
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while(b !=0){
            n = a % b;
            a = b;
            b = n;
        }

        return a;
    }

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list[i] = Math.abs(input - s);
        }
            result = list[0];
        for(int i = 1; i < n; i++) {
            result = gcd(result,list[i]);
        }

        System.out.println(result);
    }
}
