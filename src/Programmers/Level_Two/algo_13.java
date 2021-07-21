package Programmers.Level_Two;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12924
//숫자의 표현
public class algo_13 {

    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        int[] arr = new int[n+1];

        for(int i = 1; i < arr.length; i++) {
            int sum = i;
            int j = i+1;
            while(true) {
                if(sum == n){
                    count++;
                    break;
                }
                else if(sum > n) break;
                else {
                    sum += j;
                    j++;
                }
            }
        }
        System.out.println(count);

    }
}
