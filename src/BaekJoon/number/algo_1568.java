package BaekJoon.number;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1568
// 새
public class algo_1568 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        int i = 1;
        while(n > 0) {
            if(n >= i){
                n -= i;
                count ++;
                i++;

            }else {
                i = 1;
            }
        }
        System.out.println(count);
    }
}
