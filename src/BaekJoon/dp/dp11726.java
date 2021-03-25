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
                    list[i] = (list[i - 1] + list[i - 2])%10007;
                    //이 부분에서 부가적인 설명이 필요할 듯 싶다.
                    // 마지막에 %를 해도 될텐데 왜 이렇게 하는 것일까??
                    // 그 물음의 답은 오버플로우이다. 예를들어 N을 1000까지 넣을 수 있다. 그래서 1000을 넣게되면 엄청 큰 값이
                    //나오는것을 알 수 있는데 이 수가 int변수의 범위를 넘어가게 되면 내가 원하는 그 값을 얻을 수 없게 된다.
                    //for문을 돌면서 겪게되는 수많은 오버플로우로 인해서 이미 본연의 구하고자 하는 값을 잃기 때문이다.
                    //그래서 맨 마지막에 %연산을 하는 것은 이미 그 오버플로우로 인해 실제 원하는 값이 아닌, 이상한 값에 대하여 연산
                    //하는 것 이기때문에 의미 없는 연산인 것이다. 그래서 미리미리 for문을 돌면서 %연산을 적용시켜서 배열에 넣어주는 것이다.
                }
            }
        System.out.println(list[N]);
        }
    }

