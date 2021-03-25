package BaekJoon.dp;

import java.util.Scanner;

//백준 11726번 2xn 타일링 (DP)
//https://www.acmicpc.net/problem/11726
public class dp11726 {

    private static int N;

    private static int[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N+1];

            for(int i = 1; i <= N; i++){

                if(i == 1) {
                    list[i] = 1;
                }else if(i == 2) {
                    list[i] = 2;
                }
                    else {
                    list[i] = (list[i - 1] + list[i - 2]) % 10007;
                }
            }
        System.out.println(list[N]);
        }
    }

