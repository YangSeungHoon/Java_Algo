package BaekJoon.greedy;

import java.util.Arrays;
import java.util.Scanner;


//백준 5585번 거스름돈
//https://www.acmicpc.net/problem/5585
public class Greedy5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //500엔, 100엔, 50엔, 10엔, 5엔, 1
        int[] coins = {500,100,50,10,5,1};
        int count = 0;
        int pay = sc.nextInt();
        int remains = 1000 - pay;

        if(remains / 500 >= 1) {
            count += remains / 500;
            remains = remains % 500;
        }

        for (int coin : coins) {
            if (remains == 0) {
                break;
            } else if (remains / coin >= 1) {
                count += remains / coin;
                remains = remains % coin;
            }
        }
        System.out.println(count);
    }
}
