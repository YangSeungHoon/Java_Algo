package BaekJoon.number;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1668
//트로피 진열
public class algo_1668 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] list = new int[amount];
        for(int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        int left = 1;
        int leftMax =list[0];
        int end = list.length-1;
        int right = 1;
        int rightMax = list[end];

        for(int i = 0; i < list.length-1; i++) {
            if(list[i] < list[i+1] && leftMax < list[i+1]){
                left++;
                leftMax = list[i+1];
            }
            if(list[end] < list[end-1-i] && rightMax < list[end-1-i]){
                right++;
                rightMax = list[end-1-i];
            }
        }
        System.out.println(left);
        System.out.println(right);
    }
}
